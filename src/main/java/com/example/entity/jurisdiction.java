package com.example.entity;

public class jurisdiction {
    private String id;

    private String userId;

    private Integer leveltype;

    private String platetype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getLeveltype() {
        return leveltype;
    }

    public void setLeveltype(Integer leveltype) {
        this.leveltype = leveltype;
    }

    public String getPlatetype() {
        return platetype;
    }

    public void setPlatetype(String platetype) {
        this.platetype = platetype == null ? null : platetype.trim();
    }
}