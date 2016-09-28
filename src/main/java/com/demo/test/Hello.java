package com.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangxin on 2016/9/23.
 */
@Controller
@EnableAutoConfiguration
public class Hello {
    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "hahaha Spring boot com.demo.test.Hello test";
    }

    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }
}
