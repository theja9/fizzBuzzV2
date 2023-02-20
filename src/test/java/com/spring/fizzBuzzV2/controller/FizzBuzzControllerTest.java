package com.spring.fizzBuzzV2.controller;

import com.spring.fizzBuzzV2.service.FizzBuzzService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class FizzBuzzControllerTest {

    @InjectMocks
    FizzBuzzController fizzBuzzController;

    @Mock
    private FizzBuzzService fizzBuzzService;

    @Test
    public void testNumber() throws Exception {
        when(fizzBuzzService.getSubstitution(2)).thenReturn(2);
        int result = fizzBuzzController.get(2);
        assertEquals(2, result);
    }

}
