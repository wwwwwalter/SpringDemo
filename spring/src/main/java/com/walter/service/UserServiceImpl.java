package com.walter.service;


import com.walter.bean.User;
import com.walter.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void insert(User user) {
        userDao.insert(user);
        //throw new RuntimeException("good good");//测试事务回滚
    }

    @Override
    public List<User> selectAll() {
       return userDao.selectAll();
    }
}


