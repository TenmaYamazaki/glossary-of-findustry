package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class FieldsChildren extends DomainBase {

    private int fieldChildId;
    private int fieldId;
    private String fieldChildName;

    public FieldsChildren(String createUser, Date createDateTime, String updateUser, Date updateDateTime, int updateNo,
            int fieldChildId, int fieldId, String fieldChildName) {
        super(createUser, createDateTime, updateUser, updateDateTime, updateNo);
        this.fieldChildId = fieldChildId;
        this.fieldId = fieldId;
        this.fieldChildName = fieldChildName;
    }

    public int getFieldChildId() {
        return fieldChildId;
    }

    public void setFieldChildId(int fieldChildId) {
        this.fieldChildId = fieldChildId;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldChildName() {
        return fieldChildName;
    }

    public void setFieldChildName(String fieldChildName) {
        this.fieldChildName = fieldChildName;
    }

}
