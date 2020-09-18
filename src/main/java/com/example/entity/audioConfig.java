package com.example.entity;

public class audioConfig {
    private String userid;

    private Integer ausetvol;

    private Integer ausetvoiper;

    private Integer ausetspd;

    private Integer ausetpit;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getAusetvol() {
        return ausetvol;
    }

    public void setAusetvol(Integer ausetvol) {
        this.ausetvol = ausetvol;
    }

    public Integer getAusetvoiper() {
        return ausetvoiper;
    }

    public void setAusetvoiper(Integer ausetvoiper) {
        this.ausetvoiper = ausetvoiper;
    }

    public Integer getAusetspd() {
        return ausetspd;
    }

    public void setAusetspd(Integer ausetspd) {
        this.ausetspd = ausetspd;
    }

    public Integer getAusetpit() {
        return ausetpit;
    }

    public void setAusetpit(Integer ausetpit) {
        this.ausetpit = ausetpit;
    }
}