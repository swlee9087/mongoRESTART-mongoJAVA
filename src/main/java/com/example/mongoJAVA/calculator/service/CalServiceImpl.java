package com.example.mongoJAVA.calculator.service;

import com.example.mongoJAVA.calculator.entity.Calculator;
import com.example.mongoJAVA.calculator.repository.CalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class CalServiceImpl implements CalService{
    private final CalRepository calRepository;

    @Override
    public int createRandomNumber() {
        return (int)(Math.random()*100)+1;
    }
}
