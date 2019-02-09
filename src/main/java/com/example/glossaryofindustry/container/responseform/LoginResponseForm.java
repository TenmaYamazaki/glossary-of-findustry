package com.example.glossaryofindustry.container.responseform;

import com.example.glossaryofindustry.container.WebResponseForm;

public class LoginResponseForm extends WebResponseForm {

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
