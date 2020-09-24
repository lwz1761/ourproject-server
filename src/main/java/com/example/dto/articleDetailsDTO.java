package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class articleDetailsDTO {
    private String articleID;
    private String userID;
    private String userName;
    private String postTitle;
    private String postText;
    private int postPageviews;
    private String postAUdio;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS",timezone = "GMT+8")
    private Date postTime;
    private String postCom;
    private String lastCom;

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public int getPostPageviews() {
        return postPageviews;
    }

    public void setPostPageviews(int postPageviews) {
        this.postPageviews = postPageviews;
    }

    public String getPostAUdio() {
        return postAUdio;
    }

    public void setPostAUdio(String postAUdio) {
        this.postAUdio = postAUdio;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getPostCom() {
        return postCom;
    }

    public void setPostCom(String postCom) {
        this.postCom = postCom;
    }

    public String getLastCom() {
        return lastCom;
    }

    public void setLastCom(String lastCom) {
        this.lastCom = lastCom;
    }

    @Override
    public String toString() {
        return "articleDetailsDTO{" +
                "articleID='" + articleID + '\'' +
                ", userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", postText='" + postText + '\'' +
                ", postPageviews=" + postPageviews +
                ", postAUdio='" + postAUdio + '\'' +
                ", postTime=" + postTime +
                ", postCom='" + postCom + '\'' +
                ", lastCom='" + lastCom + '\'' +
                '}';
    }
}
