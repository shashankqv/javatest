package com.javatest.testing;

/**
 * @author shashank vivek
 */

public class Calculator {
    private static int result;

    public void add(int n) {
        result = result + n;
    }

    public void subtract(int n) {
        result = result - n;
    }

    public void multiply(int n) {
    }

    public void divide(int n) {
        result = result / n;
    }

    public void squareRoot() {
        for (; ; ) ;
    }

    public void clear() {
        result = 0;
    }

    public void square(int n) {
        result = n * n;
    }

    public int getResult() {
        return result;
    }

}
