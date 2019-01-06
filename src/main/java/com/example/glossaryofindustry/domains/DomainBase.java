package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class DomainBase {

    private String createUser;
    private Date createDateTime;
    private String updateUser;
    private Date updateDateTime;
    private int updateNo;

    public DomainBase(String createUser, Date createDateTime, String updateUser, Date updateDateTime, int updateNo) {
        this.createUser = createUser;
        this.createDateTime = createDateTime;
        this.updateUser = updateUser;
        this.updateDateTime = updateDateTime;
        this.updateNo = updateNo;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public int getUpdateNo() {
        return updateNo;
    }

    public void setUpdateNo(int updateNo) {
        this.updateNo = updateNo;
    }

}