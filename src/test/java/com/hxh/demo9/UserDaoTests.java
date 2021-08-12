package com.hxh.demo9;

import com.hxh.demo9.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class UserDaoTests extends BasicTests {


    private final UserDao userDao;

    @Autowired
    public UserDaoTests(UserDao userDao) {
        this.userDao = userDao;
    }

    @Test
    void testFindAll() {
        System.out.println(userDao.findAll());
    }

}
