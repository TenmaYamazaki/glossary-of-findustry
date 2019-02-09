package com.example.glossaryofindustry.container.searchcondition;

import java.util.ArrayList;
import java.util.List;

public class UsersSearchCondition {

    /** ユーザーIDリスト **/
    private List<Integer> idList = new ArrayList<>();
    /** ユーザー名 */
    private String userName;
    /** パスワード **/
    private String pasword;
    /** 管理者フラグ */
    private boolean adminFlg;

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
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

    public boolean isAdminFlg() {
        return adminFlg;
    }

    public void setAdminFlg(boolean adminFlg) {
        this.adminFlg = adminFlg;
    }

}
