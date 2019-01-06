package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class Fields extends DomainBase {

    private int fieldId;
    private String fieldName;

    public Fields(String createUser, Date createDateTime, String updateUser, Date updateDateTime, int updateNo,
            int fieldId, String fieldName) {
        super(createUser, createDateTime, updateUser, updateDateTime, updateNo);
        this.fieldId = fieldId;
        this.fieldName = fieldName;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

}
