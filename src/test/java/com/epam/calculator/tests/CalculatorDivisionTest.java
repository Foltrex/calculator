package com.epam.calculator.tests;

import com.epam.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorDivisionTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // given
        calculator = new Calculator();
    }


    @Test(expected = ArithmeticException.class)
    public void testDivideShouldntDivideWhenDividerZero() {
        //when
        int firstNumber = 4;
        int secondNumber = 0;

        // then
        calculator.divide(firstNumber, secondNumber);
    }


    @Test
    public void testDivideWhenCalculatorNotNull() {
        // then
        Assert.assertNotNull(calculator);
    }


    @Test
    public void testDivideShouldDivideWhenNumbersPositive() {
        // when
        int result = calculator.divide(4, 2);

        // then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersNegative() {
        // when
        int result = calculator.divide(-4, -2);

        // then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenOneNumberNegative() {
        // when
        int result = calculator.divide(-4, 2);

        // then
        Assert.assertEquals(-2, result);
    }
}
