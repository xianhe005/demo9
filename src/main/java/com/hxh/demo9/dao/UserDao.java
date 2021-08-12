package com.hxh.demo9.dao;

import com.hxh.demo9.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
