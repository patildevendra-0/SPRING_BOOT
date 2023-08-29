package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserModel;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<UserModel> Get_All_User()
    {
        return userDao.findAll();
    }

    public String Add_User(UserModel userModel) {
        userDao.save(userModel);
        return "SUCCESS";
    }
}
