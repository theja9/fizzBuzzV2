package com.spring.fizzBuzzV2.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    @Test
    public void testNumber() {
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.getSubstitution(1);
        assertEquals("1", actualResult);
    }

    @Test
    public void testFizzDivisibleBy3(){
        FizzBuzzService service = new FizzBuzzService();
        String actualResult = service.getSubstitution(9);
        assertEquals("fizz", actualResult);
    }

}
