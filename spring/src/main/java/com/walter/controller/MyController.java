package com.walter.controller;

import com.walter.bean.User;
import com.walter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/ssm")
    public ModelAndView ssm() {
        ModelAndView mv = new ModelAndView();

        List<User> users = userService.selectAll();
        mv.addObject("msg", users.toString());
        userService.selectAll();

        mv.setViewName("result");
        return mv;
    }
}
