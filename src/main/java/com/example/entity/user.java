package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class user {

    private String userID;

    private String userName;

    private String password;

    private int regAge;

    private Integer regSex;

    private String regPhoto;

    private String regEmail;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS",timezone = "GMT+8")
    private Date regTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS",timezone = "GMT+8")
    private Date loginTime;

    private Integer admin;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRegAge() {
        return regAge;
    }

    public void setRegAge(int regAge) {
        this.regAge = regAge;
    }

    public Integer getRegSex() {
        return regSex;
    }

    public void setRegSex(Integer regSex) {
        this.regSex = regSex;
    }

    public String getRegPhoto() {
        return regPhoto;
    }

    public void setRegPhoto(String regPhoto) {
        this.regPhoto = regPhoto;
    }

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }
}