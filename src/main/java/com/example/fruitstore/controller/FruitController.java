package com.example.fruitstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fruit")
public class FruitController {
    @GetMapping
    public void getAll(){

    }
}
