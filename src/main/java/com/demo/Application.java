package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhangxin on 2016/9/26.
 */
@SpringBootApplication //same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }
}
