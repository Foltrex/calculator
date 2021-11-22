package com.epam.calculator;

import com.epam.calculator.tests.*;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
                CalculatorSumTest.class,
                CalculatorDivisionTest.class,
                CalculatorMultiplicationTest.class,
                CalculatorDifferenceTest.class
} )
public class CalculatorTestSuite extends TestSuite {

}
