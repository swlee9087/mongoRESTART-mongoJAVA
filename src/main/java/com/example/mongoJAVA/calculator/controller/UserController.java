package com.example.mongoJAVA.calculator.controller;

import com.example.mongoJAVA.calculator.entity.User;
import com.example.mongoJAVA.calculator.service.UserService;
import com.example.mongoJAVA.calculator.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public List<User>findAll(){
        return userService.findAll();
    }
    @GetMapping("/name/{name}")
    public List<User>findAllByName(@PathVariable String name){
        return userService.findAllByName(name);
    }
    @GetMapping("/id/{id}")
    public Optional<User> findById(@PathVariable long id) {
        return userService.findById(id);
    }
}
