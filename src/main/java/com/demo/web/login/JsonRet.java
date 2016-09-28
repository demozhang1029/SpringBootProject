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

    private void setCode(String code) {
        this.code = code;
    }

    private String getCode() {
        return code;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    private String getMessage() {
        return message;
    }

    private void setData(Object data) {
        this.data = data;
    }

    private Object getData() {
        return data;
    }

    public static void main(String[] args) {
        JsonRet obj = new JsonRet("200", "hahha", null);
        System.out.println(obj.getCode() + " " + obj.getMessage() + " " + obj.getData());
    }
}

