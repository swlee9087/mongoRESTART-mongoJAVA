package com.example.mongoJAVA.calculator.controller;

import com.example.mongoJAVA.calculator.entity.User;
import com.example.mongoJAVA.calculator.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;
    @GetMapping("/users/all")
    public List<User>findAll(){
        return userService.findAll();
    }
    @GetMapping("/users/name/{name}")
    public List<User>findAllByName(@PathVariable String name){
        return userService.findAllByName(name);
    }
}
