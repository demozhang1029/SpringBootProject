package com.demo.web.login;

/**
 * Created by zhangxin on 2016/9/26.
 */
public class JsonRet {
    private String code;
    private String message;
    private Object data;

    public JsonRet(String code, String message, Object data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() { return code; }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setData(Object data) { this.data = data; }

    public Object getData() { return data; }
}

