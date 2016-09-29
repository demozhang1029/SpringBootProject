package com.demo.exception;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhangxin on 2016/9/29.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo defaultErrorHandler(HttpServletRequest request, Exception ex) {
        //ex.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler");
        ErrorInfo error = new ErrorInfo();
        error.setCode(ErrorInfo.ERROR);
        error.setMessage(ex.getMessage());
        error.setUrl(request.getRequestURL().toString());
        error.setData(null);
        return error;
    }
}
