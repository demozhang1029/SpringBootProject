package com.demo.web.login;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by zhangxin on 2016/9/26.
 */
@RestController
@RequestMapping("api/admin")
public class AdminController {

    private String sUsername = "admin";
    private String sPassword = "123456";

    /**
     * 登录
     * @param request 用于保存token到cookie中
     * @param response
     * @param map 包含用户名和密码
     * @return
     */
    @RequestMapping("/login")
    public JsonRet login(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String, String> map) {
        if (this.sUsername.equals(map.get("userName")) && this.sPassword.equals(map.get("password"))) {
            return new JsonRet(ResultCode.SUCCESS.getValue(), ResultCode.SUCCESS.getMsg(), null);
        } else {
            return new JsonRet(ResultCode.NOT_LOGIN.getValue(), ResultCode.NOT_LOGIN.getMsg(), null);
        }
    }
}
