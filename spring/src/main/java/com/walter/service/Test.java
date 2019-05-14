package com.walter.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");

        StudentService studentService = (StudentService) applicationContext.getBean(
                "studentService");

        studentService.study();
    }
}
