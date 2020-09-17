package com.example.dto;

public class JsonResult<T> {
    private int code;
    private T data;
    private String message;

    public JsonResult() {
        this(200);
    }

    public JsonResult(int code){
        this.code = code;
    }

    public JsonResult(T data) {
        this(200,data);
    }

    public JsonResult(String message) {
        this(200,message);
    }

    public JsonResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public JsonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public JsonResult(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

