package com.walter.service;

import com.walter.bean.Student;
import com.walter.dao.StudentDao;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent() {
        studentDao.addStudent(new Student("walter",123));
    }
}
