package com.walter.service;

import com.walter.dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDaoImpl studentDaoImpl;


    @Override
    public void addStudent() {
        studentDaoImpl.addStudent();
    }

    @Override
    public void selectStudentById(int id) throws Exception {
        studentDaoImpl.selectStudentById(id);
    }

    @Override
    public int updateStudent() {
        return studentDaoImpl.updateStudent();
    }

    @Override
    public void deleteStudent() {
        studentDaoImpl.deleteStudent();
    }

    @Override
    public void selectStudent() {

    }
}
