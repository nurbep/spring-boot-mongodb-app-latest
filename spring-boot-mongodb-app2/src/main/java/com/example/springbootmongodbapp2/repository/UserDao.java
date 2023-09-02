package com.example.springbootmongodbapp2.repository;

import com.example.springbootmongodbapp2.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
}
