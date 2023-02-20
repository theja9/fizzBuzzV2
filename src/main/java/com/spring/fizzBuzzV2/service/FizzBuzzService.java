package com.spring.fizzBuzzV2.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public String getSubstitution(int num) {
        if (isMultipleOf3(num) && isMultipleOf5(num)) {
            return "fizz buzz";
        }
        if (isMultipleOf3(num)) {
            return "fizz";
        }
        if (isMultipleOf5(num)) {
            return "buzz";
        }
        return String.valueOf(num);
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}
