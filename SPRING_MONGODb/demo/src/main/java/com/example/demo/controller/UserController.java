package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserModel> Get_All_User()
    {
        return userService.Get_All_User();
    }

    @PostMapping("/add")
    public String Add_User(@RequestBody UserModel userModel)
    {
        return userService.Add_User(userModel);
    }

}
