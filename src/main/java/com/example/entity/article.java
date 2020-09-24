package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class article {
    private String articleid;

    private String userid;

    private String posttitle;

    private Integer postpageviews;

    private String postaudio;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS",timezone = "GMT+8")
    private Date posttime;

    private String postcom;

    private String lastcom;

    private String posttext;

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

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle == null ? null : posttitle.trim();
    }

    public Integer getPostpageviews() {
        return postpageviews;
    }

    public void setPostpageviews(Integer postpageviews) {
        this.postpageviews = postpageviews;
    }

    public String getPostaudio() {
        return postaudio;
    }

    public void setPostaudio(String postaudio) {
        this.postaudio = postaudio == null ? null : postaudio.trim();
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getPostcom() {
        return postcom;
    }

    public void setPostcom(String postcom) {
        this.postcom = postcom == null ? null : postcom.trim();
    }

    public String getLastcom() {
        return lastcom;
    }

    public void setLastcom(String lastcom) {
        this.lastcom = lastcom == null ? null : lastcom.trim();
    }

    public String getPosttext() {
        return posttext;
    }

    public void setPosttext(String posttext) {
        this.posttext = posttext == null ? null : posttext.trim();
    }
}