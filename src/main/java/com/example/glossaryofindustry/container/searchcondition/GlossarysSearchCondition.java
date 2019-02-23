package com.example.glossaryofindustry.container.searchcondition;

import java.util.ArrayList;
import java.util.List;

import com.example.glossaryofindustry.domains.Glossarys;

public class GlossarysSearchCondition {

    /** 用語IDリスト */
    private List<Glossarys> idList = new ArrayList<>();
    /** 用語 */
    private String terminology;
    /** 分野区分 */
    private int fieldId;

    public List<Glossarys> getIdList() {
        return idList;
    }

    public void setIdList(List<Glossarys> idList) {
        this.idList = idList;
    }

    public void addIdList(Glossarys idList) {
        this.idList.add(idList);
    }

    public String getTerminology() {
        return terminology;
    }

    public void setTerminology(String terminology) {
        this.terminology = terminology;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

}