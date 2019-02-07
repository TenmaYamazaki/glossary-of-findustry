package com.example.glossaryofindustry.controllers.receiver;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.glossaryofindustry.container.IndexRecord;
import com.example.glossaryofindustry.container.WebResponseResult;
import com.example.glossaryofindustry.container.record.GlossarysRecord;
import com.example.glossaryofindustry.container.requestform.GlossaryRequestForm;
import com.example.glossaryofindustry.container.responseform.GlossaryResponseForm;
import com.example.glossaryofindustry.container.searchcondition.GlossarysSearchCondition;
import com.example.glossaryofindustry.domains.Fields;
import com.example.glossaryofindustry.domains.FieldsChildren;
import com.example.glossaryofindustry.domains.Glossarys;
import com.example.glossaryofindustry.service.FieldDivService;
import com.example.glossaryofindustry.service.GlossarysService;

@Component
public class GlossaryReceiver implements WebReceiver {

    @Autowired
    HttpSession session;
    @Autowired
    private GlossarysService glossarysService;
    @Autowired
    @Qualifier("fieldDivSearviceImpl")
    private FieldDivService fieldDivService;

    public WebResponseResult<GlossaryResponseForm> init() {
        WebResponseResult<GlossaryResponseForm> result = new WebResponseResult<>();
        GlossaryResponseForm responseForm = new GlossaryResponseForm();

        List<Fields> fieldList = fieldDivService.searchAllFields();
        List<FieldsChildren> fieldsChildrenList = fieldDivService.searchAllFieldsChildren();

        for (FieldsChildren fieldsChildren : fieldsChildrenList) {
            IndexRecord record = new IndexRecord();
            for (Fields fields : fieldList) {
                if (fields.getFieldId() == fieldsChildren.getFieldId()) {
                    record.setFieldChildName(fieldsChildren.getFieldChildName());
                    record.setFieldName(fields.getFieldName());
                    record.setFieldChildId(String.valueOf(fieldsChildren.getFieldChildId()));
                    break;
                }
            }
            responseForm.addIndexRecordList(record);
        }
        result.setTemplateName("glossaryIndex");
        result.setResponseForm(responseForm);
        return result;
    }

    public WebResponseResult<GlossaryResponseForm> search(GlossaryRequestForm requestForm) {
        WebResponseResult<GlossaryResponseForm> result = new WebResponseResult<>();
        GlossaryResponseForm responseForm = new GlossaryResponseForm();

        GlossarysSearchCondition searchCondition = new GlossarysSearchCondition();
        searchCondition.setFieldChildDiv(Integer.parseInt(requestForm.getFieldChildId()));
        List<Glossarys> glossarysList = glossarysService.findBySearchCondition(searchCondition);

        for (Glossarys glossarys : glossarysList) {
            GlossarysRecord record = new GlossarysRecord();
            record.setTerminology(glossarys.getTerminology());
            record.setWordDescription(glossarys.getWordDescription());
            responseForm.addRecordList(record);
        }

        session.setAttribute("reqSearch", requestForm);
        result.setTemplateName("glossarySearch");
        result.setResponseForm(responseForm);
        return result;
    }

    public WebResponseResult<GlossaryResponseForm> add(GlossaryRequestForm requestForm) {
        GlossaryRequestForm searchRequestForm = (GlossaryRequestForm) session.getAttribute("reqSearch");
        glossarysService.addGlossarys(Integer.parseInt(searchRequestForm.getFieldChildId()),
                requestForm.getAddTerminology(), requestForm.getAddDesc());
        return this.search(searchRequestForm);
    }
}
