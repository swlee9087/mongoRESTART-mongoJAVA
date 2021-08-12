package com.example.mongoJAVA.calculator.controller;

import com.example.mongoJAVA.calculator.entity.Item;
import com.example.mongoJAVA.calculator.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/all")
    public List<Item> findAll() {
        return itemService.findAll();
    }

    @GetMapping("name/{name}")
    public List<Item> findAllByItemName(@PathVariable String itemName) {
        return itemService.findAllByItemName(itemName);
    }

    @GetMapping("/id/{id}")
    public Optional<Item> findById(@PathVariable long id) {
        return itemService.findById(id);

    }
}
