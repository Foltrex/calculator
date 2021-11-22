package com.epam.calculator.tests;

import com.epam.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorMultiplicationTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // given
        calculator = new Calculator();
    }


    @Test
    public void testMultiplyWhenCalculatorNotNull() {
        // then
        Assert.assertNotNull(calculator);
    }


    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive() {
        // when
        int result = calculator.multiply(2, 3);

        // then
        Assert.assertEquals(6, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative() {
        //when
        int result = calculator.multiply(-5, -4);

        // then
        Assert.assertEquals(20, result);
    }


    @Test
    public void testMultiplyShouldMultiplyWhenOneNumberNegative() {
        // when
        int result = calculator.multiply(-2, 3);

        // then
        Assert.assertEquals(-6, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenOneNumberZero() {
        // when
        int result = calculator.multiply(12, 0);

        // then
        Assert.assertEquals(0, result);
    }
}
