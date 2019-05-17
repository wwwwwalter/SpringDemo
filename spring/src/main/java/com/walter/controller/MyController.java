package com.walter.controller;

import com.alibaba.fastjson.JSON;
import com.walter.bean.User;
import com.walter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/selectall")
    public String selectall() {
        List<User> users = userService.selectAll();
        System.out.println(users);
        return JSON.toJSONString(users);
    }

    //前端的普通form只支持get、post,这里用get为了测试
    @GetMapping("/insert")
    public String insert(User user) {
        System.out.println(user);
        userService.insert(user);
        return JSON.toJSONString(user);
    }
}
