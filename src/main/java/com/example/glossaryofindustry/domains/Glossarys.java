package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class Glossarys extends DomainBase {

    private int glossaryId;
    private String terminology;
    private int fieldId;
    private String wordDescription;
    private Boolean comentFlg;

    public Glossarys(int glossaryId, String terminology, int fieldId, String wordDescription, Boolean comentFlg,
            String createUser, Date createDateTime, String updateUser, Date updateDateTime, int updateNo) {
        super(createUser, createDateTime, updateUser, updateDateTime, updateNo);
        this.glossaryId = glossaryId;
        this.terminology = terminology;
        this.fieldId = fieldId;
        this.wordDescription = wordDescription;
        this.comentFlg = comentFlg;
    }

    public int getGlossaryId() {
        return glossaryId;
    }

    public void setGlossaryId(int glossaryId) {
        this.glossaryId = glossaryId;
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

    public String getWordDescription() {
        return wordDescription;
    }

    public void setWordDescription(String wordDescription) {
        this.wordDescription = wordDescription;
    }

    public Boolean getComentFlg() {
        return comentFlg;
    }

    public void setComentFlg(Boolean comentFlg) {
        this.comentFlg = comentFlg;
    }

}
