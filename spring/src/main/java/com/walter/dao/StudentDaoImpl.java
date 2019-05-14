package com.walter.dao;

import com.walter.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studentDaoImpl")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private Student student;

    @Override
    public void addStudent() {
        System.out.println("addStudent");
    }

    @Override
    public void selectStudentById(int id) throws Exception {
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
