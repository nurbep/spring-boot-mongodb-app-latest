package com.example.springbootmongodbapp2.repository;

import com.example.springbootmongodbapp2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomUserRepository implements UserDao {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public CustomUserRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<User> getAllUser() {
        return mongoTemplate.findAll(User.class);
    }

}
