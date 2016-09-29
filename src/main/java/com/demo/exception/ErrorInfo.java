package com.demo.exception;

/**
 * Created by zhangxin on 2016/9/29.
 */
public class ErrorInfo {

    public static final int SUCCESS = 200;
    public static final int ERROR = 400;

    private int code;
    private String message;
    private String url;
    private Object data;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
