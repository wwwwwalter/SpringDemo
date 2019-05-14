package com.walter.dao;

import com.walter.bean.Student;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("dao:" + student);
    }
}
