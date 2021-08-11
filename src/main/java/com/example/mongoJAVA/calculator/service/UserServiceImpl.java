package com.example.mongoJAVA.calculator.service;

import com.example.mongoJAVA.calculator.entity.User;
import com.example.mongoJAVA.calculator.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public List<User>findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}
