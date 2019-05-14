package com.walter.controller;

import com.walter.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @RequestMapping("/springmvc")
    public ModelAndView springmvc() {
        ModelAndView mv = new ModelAndView();
        studentServiceImpl.addStudent();
        studentServiceImpl.deleteStudent();
        try {
            studentServiceImpl.selectStudentById(1);
        } catch (Exception e) {
            System.out.println("捕捉异常");
        }
        studentServiceImpl.updateStudent();

        mv.addObject("msg", "done");
        mv.setViewName("result");

        return mv;
    }
}
