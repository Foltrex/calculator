package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(1, 2);

        // then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(-1, -2);

        // then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testDifferenceShouldDifferenceWhenNumbersPositive() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.difference(6, 5);

        // then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testDifferenceShouldDifferenceWhenNumbersNegative() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.difference(-6, -5);

        // then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersPositive() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(2, 3);

        // then
        Assert.assertEquals(6, result);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenOneNumberNegative() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(-2, 3);

        // then
        Assert.assertEquals(-6, result);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(4, 2);

        // then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideShouldDivideWhenOneNumberNegative() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(-4, 2);

        // then
        Assert.assertEquals(-2, result);
    }
    
}
