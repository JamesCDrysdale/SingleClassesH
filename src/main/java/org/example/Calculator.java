package org.example;

public class Calculator {

    public Calculator(){} // Empty constructor

    public int add( int firstNumber, int secondNumber ) {
        return  firstNumber + secondNumber;
    }

    public int subtract( int firstNumber, int secondNumber ) {
        return firstNumber - secondNumber;
    }

    public int multiply( int firstNumber, int secondNumber ) {
        return firstNumber * secondNumber;
    }

    public double divide( double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
