package com.walter.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * @DateTimeFormat作用：
 * 前端==>controller
 * 在前端‘时间字符串’进入controller之前
 * 把时间字符串转成LocalDate
 * controller==>前端
 * return的是json不用人工干预
 */

/**
 * Mapper<==>MySql
 * LocalDate<==>Date自动处理，不用人工干预
 * Date<==>Date自动处理，不用人工干预
 */

public class User {
    private int id;
    private String username;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
