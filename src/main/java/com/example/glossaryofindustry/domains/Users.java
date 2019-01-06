package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class Users {

    private int userId;
    private String userName;
    private String pasword;
    private Boolean adminFlg;
    private Date createDateTime;

    public Users(int userId, String userName, String pasword, Boolean adminFlg, Date createDateTime) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.pasword = pasword;
        this.adminFlg = adminFlg;
        this.createDateTime = createDateTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public Boolean getAdminFlg() {
        return adminFlg;
    }

    public void setAdminFlg(Boolean adminFlg) {
        this.adminFlg = adminFlg;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

}
