package com.example.mongoJAVA.calculator.service;

import com.example.mongoJAVA.calculator.entity.Item;
import com.example.mongoJAVA.calculator.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    List<Item> findAll();
    List<Item>findAllByItemName(String itemName);
    Optional<Item> findById(long id);
}
