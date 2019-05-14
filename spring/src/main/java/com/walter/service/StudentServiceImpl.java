package com.walter.service;

import com.walter.bean.Student;
import com.walter.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    @Autowired
    @Qualifier("studentDaoImpl")
    private StudentDao studentDao;

   /* //被@Autowired取代
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }*/

    @Override
    public void addStudent() {
        studentDao.addStudent(new Student("walter", 123));
    }
}
