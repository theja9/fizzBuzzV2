package com.spring.fizzBuzzV2.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    private FizzBuzzService service;

    @BeforeEach
    public void setup() {
        service = new FizzBuzzService();
    }

    @Test
    public void testNumber() {
        String actualResult = service.getSubstitution(1);
        assertEquals("1", actualResult);
    }

    @Test
    public void testFizzDivisibleBy3(){
        String actualResult = service.getSubstitution(9);
        assertEquals("fizz", actualResult);
    }

    @Test
    public void testBuzzDivisibleBy5(){
        String actualResult = service.getSubstitution(5);
        assertEquals("buzz", actualResult);
    }



}
