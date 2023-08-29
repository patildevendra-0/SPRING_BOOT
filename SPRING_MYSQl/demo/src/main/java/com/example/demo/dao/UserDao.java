package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserModel;

@Repository
public interface UserDao extends JpaRepository<UserModel,Integer>{
    
}
