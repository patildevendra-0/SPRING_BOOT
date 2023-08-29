package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserModel;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<UserModel> Get_All_User() {
        return userDao.findAll();
    }

    public String Save_User(UserModel user) {
        userDao.save(user);
        return "success";

    }

    public Optional<UserModel> Get_User_By_ID(int userid) {
        return userDao.findById(userid);
    }

    public String Delete_User_By_Id(int userId) {
        userDao.deleteById(userId);
        return "STATUS : SUCCESS";
    }

    public UserModel Update_User_By_Id(int userId, UserModel new_User_Data) {
        Optional<UserModel> User = userDao.findById(userId);
        if(User.isPresent())
        {
            UserModel user_data = User.get();
            user_data.setUsername(new_User_Data.getUsername());
            user_data.setEmail(new_User_Data.getEmail());
            return userDao.save(user_data);
        }
        else
        {
            return null;
        }
    }

   

  
    
}
