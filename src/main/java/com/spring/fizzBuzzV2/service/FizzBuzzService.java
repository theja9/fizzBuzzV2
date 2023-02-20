package com.spring.fizzBuzzV2.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public String getSubstitution(int num) {
        if (num % 3 == 0) {
            return "fizz";
        }
        if (num % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(num);
    }
}
