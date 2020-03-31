package com.Exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
异常处理器
 */
public class ExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, java.lang.Exception e) {
        ArithmeticException arithmeticException = null ;
        if(e instanceof ArithmeticException)
            arithmeticException = (ArithmeticException)e ;//注意格式 ：（类型）异常对象
        else
            arithmeticException = new ArithmeticException("算术错误......") ;
        ModelAndView modelAndView  = new ModelAndView() ;
        modelAndView.addObject("ErrorMessage",arithmeticException.getMessage()) ;
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
