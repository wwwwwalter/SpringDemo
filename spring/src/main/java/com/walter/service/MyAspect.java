package com.walter.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;


@Component
public class MyAspect {


    public void before() {
        System.out.println("前置通知");
    }


    public void after() {
        System.out.println("最终通知");
    }


    public void afterThrowing(Exception e) {
        System.out.println("异常通知");
    }

    public void afterReturing(int result) {
        System.out.println("后置通知");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知：前");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知：后");
        return proceed;
    }
}
