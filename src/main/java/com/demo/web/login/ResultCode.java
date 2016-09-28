package com.demo.web.login;

/**
 * Created by zhangxin on 2016/9/26.
 */
public enum  ResultCode {
    SUCCESS("200", "成功"),
    NOT_LOGIN("400", "没有登录"),
    EXCEPTION("401", "发生异常"),
    SYS_ERROR("402", "系统错误"),
    PARAMS_ERROR("403", "参数错误"),
    NOT_SUPPORTED("410", "不支持或已废弃"),
    INVALIED_AUTHCODE("444", "无效的AuthCode"),
    TOO_FREQUENT("445", "太频繁的调用"),
    UNKNOWN_ERROR("499", "未知错误");

    public String getValue() {
        return value;
    }

    public String getMsg() {
        return msg;
    }

    private ResultCode(String sValue, String sMsg) {
        this.value = sValue;
        this.msg = sMsg;
    }

    private String value;
    private String msg;
}
