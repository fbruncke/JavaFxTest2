package com.example.javafxtest2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    public void testAddTwoEvenDigits()
    {
        //tripple A test add method

        //arrange
        Calculator c = new Calculator();

        //act
        c.setDigit1(10);
        c.setDigit2(20);

        //assert
        assertEquals(c.getDigitResult(),30,0);
    }

    @Test
    public void testAddTwoOddDigits()
    {
        //tripple A test

        //arrange
        Calculator c = new Calculator();

        //act
        c.setDigit1(11);
        c.setDigit2(23);

        //assert
        assertEquals(c.getDigitResult(),34,0);
    }

    @Test
    public void testNothing()
    {


        //assert
        assertEquals(12,10,2);
    }

}