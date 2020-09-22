package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class commentsDto {
    private String commentid;

    private String articleid;

    private String userid;

    private Date commenttime;

    private String articlename;

    private String commenttext;

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename;
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext;
    }
}
