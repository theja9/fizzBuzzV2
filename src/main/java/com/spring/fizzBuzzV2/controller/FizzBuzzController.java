package com.spring.fizzBuzzV2.controller;

import com.spring.fizzBuzzV2.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @GetMapping("/{num}")
    public int get(@PathVariable int num) {
        return fizzBuzzService.getSubstitution(num);
    }

}

