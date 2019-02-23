package com.example.glossaryofindustry.container.responseform;

import java.util.ArrayList;
import java.util.List;

import com.example.glossaryofindustry.container.WebResponseForm;
import com.example.glossaryofindustry.container.record.GlossarysRecord;
import com.example.glossaryofindustry.domains.Fields;

public class GlossaryResponseForm extends WebResponseForm {

    /** フィールドリスト */
    private List<Fields> fieldList = new ArrayList<>();

    /** レコードリスト */
    private List<GlossarysRecord> recordList = new ArrayList<>();

    public List<Fields> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Fields> fieldList) {
        this.fieldList = fieldList;
    }

    public void addFieldList(Fields field) {
        this.fieldList.add(field);
    }

    public List<GlossarysRecord> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<GlossarysRecord> recordList) {
        this.recordList = recordList;
    }

    public void addRecordList(GlossarysRecord record) {
        this.recordList.add(record);
    }
}
