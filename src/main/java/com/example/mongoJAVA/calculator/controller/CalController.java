package com.example.mongoJAVA.calculator.controller;

import com.example.mongoJAVA.calculator.service.CalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public final class CalController {
    private final CalService calService;



}
