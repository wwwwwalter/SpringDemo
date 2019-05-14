package com.walter.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");

        StudentService studentService = (StudentService) applicationContext.getBean(
                "studentServiceImpl");

        studentService.addStudent();
        System.out.println("-----------------");
        studentService.selectStudent();
        System.out.println("-----------------");
        try {
            studentService.selectStudentById(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------------");
        studentService.updateStudent();
        System.out.println("-----------------");
        studentService.deleteStudent();
        System.out.println("-----------------");


    }
}
