package com.demo.web.login;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangxin on 2016/9/26.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/{id}")
    public String show(@PathVariable("id") Long id) {
        return id + " hello RESTful web Service 123 ";
    }

    @RequestMapping("/zeroException")
    public int zeroException() {
        return 100/0;
    }
}
