package com.walter.service;

import org.springframework.stereotype.Service;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {


    @Override
    public void addStudent() {
        System.out.println("addStudent");
    }

    @Override
    public void selectStudentById(int id) throws Exception{
        System.out.println("selectStudentById");
        throw new Exception();
    }

    @Override
    public int updateStudent() {
        System.out.println("updateStudent");
        return 0;
    }

    @Override
    public void deleteStudent() {
        System.out.println("deleteStudent");
    }

    @Override
    public void selectStudent() {
        System.out.println("selectStudent");
    }
}
