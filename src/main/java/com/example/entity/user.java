package com.example.entity;

import java.util.Date;

public class user {
    private String userid;

    private String username;

    private String password;

    private Integer regage;

    private String regsex;

    private String regemail;

    private String regphoto;

    private String admin;

    private Date regtime;

    private Date logintime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRegage() {
        return regage;
    }

    public void setRegage(Integer regage) {
        this.regage = regage;
    }

    public String getRegsex() {
        return regsex;
    }

    public void setRegsex(String regsex) {
        this.regsex = regsex == null ? null : regsex.trim();
    }

    public String getRegemail() {
        return regemail;
    }

    public void setRegemail(String regemail) {
        this.regemail = regemail == null ? null : regemail.trim();
    }

    public String getRegphoto() {
        return regphoto;
    }

    public void setRegphoto(String regphoto) {
        this.regphoto = regphoto == null ? null : regphoto.trim();
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin == null ? null : admin.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}