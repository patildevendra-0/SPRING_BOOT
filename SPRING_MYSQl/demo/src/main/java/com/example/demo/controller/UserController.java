package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

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
    private String Save_User(@RequestBody UserModel user)
    {
        return userService.Save_User(user);
    }
    
    @PostMapping("/id/{userId}")
    private Optional<UserModel> Get_User_By_ID(@PathVariable int userId)
    {
        // System.out.println("----------------------------------->"+userId);
        return userService.Get_User_By_ID(userId);
    }
    
    @PostMapping("/delete/{userId}")
    private String Delete_User_By_Id(@PathVariable int userId)
    {
        return userService.Delete_User_By_Id(userId);
    }

    @PutMapping("/update/{userId}")
    private ResponseEntity<UserModel> Update_User_By_Id(@PathVariable int userId,@RequestBody UserModel New_User_Data)
    {
        UserModel UserData = userService.Update_User_By_Id(userId,New_User_Data);

        if(UserData != null)
        {
            return ResponseEntity.ok(UserData);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
