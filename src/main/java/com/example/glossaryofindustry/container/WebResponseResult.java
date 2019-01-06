package com.example.glossaryofindustry.container;

import java.util.ArrayList;
import java.util.List;

public class WebResponseResult {

    private WebResponseForm responseForm;
    private List<String> infoMessageList = new ArrayList<>();
    private List<String> errMessageList = new ArrayList<>();
    private String className;

    public WebResponseResult(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public WebResponseForm getResponseForm() {
        return responseForm;
    }

    public void setResponseForm(WebResponseForm responseForm) {
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

}
