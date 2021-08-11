package com.example.mongoJAVA.calculator.service;

import com.example.mongoJAVA.calculator.entity.Calculator;
import com.example.mongoJAVA.calculator.repository.CalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public interface CalService {
//    private final CalRepository calRepository;  @0810 no repository made avail;

    int createRandomNumber();
}
