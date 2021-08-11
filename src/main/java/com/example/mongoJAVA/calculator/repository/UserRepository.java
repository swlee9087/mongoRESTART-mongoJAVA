package com.example.mongoJAVA.calculator.repository;

import com.example.mongoJAVA.calculator.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    List<User>findAllByName(String name);
}
