package com.example.glossaryofindustry.container;

import java.util.ArrayList;
import java.util.List;

public class WebResponseResult<T extends WebResponseForm> {

    private T responseForm;
    private List<String> infoMessageList = new ArrayList<>();
    private List<String> errMessageList = new ArrayList<>();

    /** テンプレート名 */
    private String templateName;

    public WebResponseForm getResponseForm() {
        return responseForm;
    }

    public void setResponseForm(T responseForm) {
        this.responseForm = responseForm;
    }

    public List<String> getInfoMessageList() {
        return infoMessageList;
    }

    public void setInfoMessageList(List<String> infoMessageList) {
        this.infoMessageList = infoMessageList;
    }

    public List<String> getErrMessageList() {
        return errMessageList;
    }

    public void setErrMessageList(List<String> errMessageList) {
        this.errMessageList = errMessageList;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

}
