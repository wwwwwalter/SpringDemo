package com.walter.service;

import com.walter.bean.Student;

public interface StudentService {
    void addStudent();

    void selectStudentById(int id) throws Exception;

    int updateStudent();

    void deleteStudent();

    void selectStudent();

}
