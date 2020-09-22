package com.example.entity;

public class audioConfig {
    private String userid;

    private int ausetvol;

    private int ausetvoiper;

    private int ausetspd;

    private int ausetpit;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public int getAusetvol() {
        return ausetvol;
    }

    public void setAusetvol(int ausetvol) {
        this.ausetvol = ausetvol;
    }

    public int getAusetvoiper() {
        return ausetvoiper;
    }

    public void setAusetvoiper(int ausetvoiper) {
        this.ausetvoiper = ausetvoiper;
    }

    public int getAusetspd() {
        return ausetspd;
    }

    public void setAusetspd(int ausetspd) {
        this.ausetspd = ausetspd;
    }

    public int getAusetpit() {
        return ausetpit;
    }

    public void setAusetpit(int ausetpit) {
        this.ausetpit = ausetpit;
    }
}