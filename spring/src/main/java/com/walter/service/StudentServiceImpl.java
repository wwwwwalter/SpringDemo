package com.walter.service;

public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {
        System.out.println("init");
    }

    @Override
    public void study() {
        System.out.println("好好学习");
    }
}
