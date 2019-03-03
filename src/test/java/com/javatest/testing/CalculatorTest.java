package com.javatest.testing;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author shashank vivek
 */

public class CalculatorTest {
    private static Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception{
        calculator.clear();
    }

    @Test
    public void testAdd(){
        calculator.add(3);
        calculator.add(4);
        assertEquals(7, calculator.getResult());
    }

    @Test
    public void testSubtract(){
        calculator.add(8);
        calculator.subtract(3);
        assertEquals(5,calculator.getResult());
    }

    @Ignore("Multiply not implemented yet ")
    @Test
    public void testMultiply(){
        fail("Not yet implemented");
    }

    @Test
    public void testDivide(){
        calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
    }

    @Test(timeout = 1000)
    public void testSquareRoot(){
        calculator.squareRoot();
    }

    @Test(timeout = 5000)
    public void testSquareRootLong(){
        calculator.squareRoot();
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero(){
        calculator.divide(0);
    }

}