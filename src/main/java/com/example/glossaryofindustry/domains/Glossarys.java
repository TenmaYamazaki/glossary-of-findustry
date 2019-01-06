package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class Glossarys extends DomainBase {

    private int glossaryId;
    private String terminology;
    private int fieldDiv;
    private int fieldChildDiv;
    private String wordDescription;
    private Boolean comentFlg;

    public Glossarys(String createUser, Date createDateTime, String updateUser, Date updateDateTime, int updateNo,
            int glossaryId, String terminology, int fieldDiv, int fieldChildDiv, String wordDescription,
            Boolean comentFlg) {
        super(createUser, createDateTime, updateUser, updateDateTime, updateNo);
        this.glossaryId = glossaryId;
        this.terminology = terminology;
        this.fieldDiv = fieldDiv;
        this.fieldChildDiv = fieldChildDiv;
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

    public int getFieldDiv() {
        return fieldDiv;
    }

    public void setFieldDiv(int fieldDiv) {
        this.fieldDiv = fieldDiv;
    }

    public int getFieldChildDiv() {
        return fieldChildDiv;
    }

    public void setFieldChildDiv(int fieldChildDiv) {
        this.fieldChildDiv = fieldChildDiv;
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
