package com.example.glossaryofindustry.domains;

import java.sql.Date;

public class Comments extends DomainBase {

    private int glossarysId;
    private String comment;

    public Comments(String createUser, Date createDateTime, String updateUser, Date updateDateTime, int updateNo,
            int glossarysId, String comment) {
        super(createUser, createDateTime, updateUser, updateDateTime, updateNo);
        this.glossarysId = glossarysId;
        this.comment = comment;
    }

    public int getGlossarysId() {
        return glossarysId;
    }

    public void setGlossarysId(int glossarysId) {
        this.glossarysId = glossarysId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
