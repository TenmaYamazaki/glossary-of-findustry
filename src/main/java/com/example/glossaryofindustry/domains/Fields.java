package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class Fields extends DomainBase {

    private int fieldId;
    private String fieldName;;
    private String fieldGenre;

    public Fields(int fieldId, String fieldName, String fieldGenre, String createUser, Date createDateTime,
            String updateUser, Date updateDateTime, int updateNo) {
        super(createUser, createDateTime, updateUser, updateDateTime, updateNo);
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.fieldGenre = fieldGenre;
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

    public String getFieldGenre() {
        return fieldGenre;
    }

    public void setFieldGenre(String fieldGenre) {
        this.fieldGenre = fieldGenre;
    }

}
