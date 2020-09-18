package com.example.entity;

import java.util.Date;

public class comments {
    private String commentid;

    private String articleid;

    private String userid;

    private Date commenttime;

    private String commentaudio;

    private String commenttext;

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid == null ? null : commentid.trim();
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getCommentaudio() {
        return commentaudio;
    }

    public void setCommentaudio(String commentaudio) {
        this.commentaudio = commentaudio == null ? null : commentaudio.trim();
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext == null ? null : commenttext.trim();
    }
}