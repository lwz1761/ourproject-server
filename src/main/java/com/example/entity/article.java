package com.example.entity;

public class article {
    private String id;

    private String title;

    private String content;

    private String ownerId;

    private String platetype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    public String getPlatetype() {
        return platetype;
    }

    public void setPlatetype(String platetype) {
        this.platetype = platetype == null ? null : platetype.trim();
    }
}