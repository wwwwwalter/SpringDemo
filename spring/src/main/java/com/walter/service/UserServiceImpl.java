package com.walter.service;


import com.walter.bean.User;
import com.walter.dao.UserDao;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = NullPointerException.class)
    public void insert(User user) {
        //测试事务回滚
        User user0 = new User();
        user0.setName("graham");
        user0.setPassword("333");
        userDao.insert(user0);

        if (user == null) throw new NullPointerException();
        userDao.insert(user);
        //throw new RuntimeException("good good");//测试事务回滚
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}


