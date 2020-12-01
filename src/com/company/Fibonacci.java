package com.company;

public class Fibonacci {
    public static void fibonacciSequence() {
        // Initial number
        int number1 = 0;
        // Secondary number
        int number2 = 1;
        // Number of terms
        int n = 10;
        Printer.printMessage("First "+ n +" terms: ");
        for( int i = 1; i <=n; ++i) {
            Printer.printMessage(number1 + " ");

            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }
}
