package com.epam.calculator.tests;

import com.epam.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorSumTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // given
        calculator = new Calculator();
    }

    @Test
    public void testAddWhenCalculatorNotNull() {
        // then
        Assert.assertNotNull(calculator);
    }

    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        // when
        int result = calculator.add(1, 2);

        // then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        // when
        int result = calculator.add(-1, -2);

        // then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testAddShouldAddWhenOneNumberNegative() {
        // when
        int result = calculator.add(1, -2);

        // then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testAddShouldGiveZiroWhenOneNumberOppsite() {
        // when
        int number = 10;
        int oppositeNumber = -number;

        int result = number + oppositeNumber;

        // then
        Assert.assertEquals(0, result);
    }
}
