package com.yan.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 基于注解的异常处理器类
// 表示当前类是一个处理异常的类
@ControllerAdvice
public class MyExceptionResolver {

    // 表示捕获到 Exception 类型的异常对象由当前方法处理
    @ExceptionHandler(value = Exception.class)
    public ModelAndView resolveException(Exception exception, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("发生全局异常!");
        ModelMap mmp=new ModelMap();
        mmp.addAttribute("exception",exception.getMessage());
        return new ModelAndView("error",mmp);
    }

}
