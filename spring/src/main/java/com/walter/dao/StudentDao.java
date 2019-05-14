package com.walter.dao;

import com.walter.bean.Student;

public interface StudentDao {
    void addStudent();

    void selectStudentById(int id) throws Exception;

    int updateStudent();

    void deleteStudent();

    void selectStudent();
}
