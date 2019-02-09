package com.example.glossaryofindustry.container.requestform;

import com.example.glossaryofindustry.container.WebRequestForm;

public class LoginRequestForm extends WebRequestForm {

    /** ユーザー名 */
    private String userName;
    /** パスワード */
    private String pasword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
