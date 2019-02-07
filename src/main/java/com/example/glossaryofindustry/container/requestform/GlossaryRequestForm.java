package com.example.glossaryofindustry.container.requestform;

import com.example.glossaryofindustry.container.WebRequestForm;

public class GlossaryRequestForm extends WebRequestForm {

    /** 分野子区分 */
    private String fieldChildId;
    /** 入力された用語名 */
    private String addTerminology;
    /** 入力された説明 */
    private String addDesc;

    public String getFieldChildId() {
        return fieldChildId;
    }

    public void setFieldChildId(String fieldChildId) {
        this.fieldChildId = fieldChildId;
    }

    public String getAddTerminology() {
        return addTerminology;
    }

    public void setAddTerminology(String addTerminology) {
        this.addTerminology = addTerminology;
    }

    public String getAddDesc() {
        return addDesc;
    }

    public void setAddDesc(String addDesc) {
        this.addDesc = addDesc;
    }

}
