package com.epam.calculator.tests;

import com.epam.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorDifferenceTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // given
        calculator = new Calculator();
    }


    @Test
    public void testSubtractWhenCalculatorNotNull() {
        // then
        Assert.assertNotNull(calculator);
    }


    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive() {
        // when
        int result = calculator.subtract(6, 5);

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative() {
        // when
        int result = calculator.subtract(-6, -5);

        // then
        Assert.assertEquals(-1, result);
    }


    @Test
    public void testSubtractShouldSubtractWhenFirstNumberNegative() {
        // when
        int result = calculator.subtract(-3, 5);

        //then
        Assert.assertEquals(-8, result);
    }

    @Test
    public void testSubtractShouldSubtractWhenSecondNumberNegative() {
        // when
        int result = calculator.subtract(5, -4);

        // then
        Assert.assertEquals(9, result);
    }


    @Test
    public void testSubtractShouldGiveZiroWhenNumbersEqual() {
        // when
        int result = calculator.subtract(4, 4);

        // then
        Assert.assertEquals(0, result);
    }
}
