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

    @RequestMapping("/selectall")
    public ModelAndView selectall() {
        ModelAndView mv = new ModelAndView();
        List<User> users = userService.selectAll();
        mv.addObject("msg", users);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/insert")
    public ModelAndView insert() {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setName("walter");
        user.setPassword("222");
        userService.insert(user);
        mv.addObject("msg", user);
        mv.setViewName("result");
        return mv;
    }
}
