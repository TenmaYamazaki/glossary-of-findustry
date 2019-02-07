package com.example.glossaryofindustry.container.searchcondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.glossaryofindustry.domains.Glossarys;

public class GlossarysSearchCondition {

    /** 用語IDリスト */
    private List<Glossarys> idList = new ArrayList<>();
    /** 用語 */
    private String terminology;
    /** 分野区分 */
    private int fieldDiv;
    /** 分野子区分 */
    private int fieldChildDiv;

    public List<Glossarys> getIdList() {
        return idList;
    }

    public void setIdList(List<Glossarys> glossarysList) {
        this.idList = glossarysList;
    }

    public void addIdList(Glossarys glossarys) {
        this.idList.add(glossarys);
    }

    public void setIdList(Glossarys glossarys) {
        this.idList = Arrays.asList(glossarys);
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

}