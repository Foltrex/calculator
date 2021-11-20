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
}
