package com.walter.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* *..StudentServiceImpl.addStudent())")
    public void before() {
        System.out.println("前置通知");
    }

    @After("execution(* *..StudentServiceImpl.selectStudent())")
    public void after() {
        System.out.println("最终通知");
    }

    @AfterThrowing(value = "execution(* *..StudentServiceImpl.selectStudentById(..))",throwing="e")
    public void afterThrowing(Exception e) {
        System.out.println("异常通知");
    }
    @AfterReturning(value = "execution(* *..StudentServiceImpl.updateStudent())",returning =
            "result")
    public void afterReturing(int result) {
        System.out.println("后置通知");
    }
    @Around("execution(* *..StudentServiceImpl.deleteStudent())")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知：前");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知：后");
        return proceed;
    }
}
