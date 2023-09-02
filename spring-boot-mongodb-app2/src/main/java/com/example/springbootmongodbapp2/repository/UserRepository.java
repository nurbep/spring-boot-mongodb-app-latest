package com.example.springbootmongodbapp2.repository;

import com.example.springbootmongodbapp2.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{

}
