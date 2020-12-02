package com.company;

public class Fibonacci {
    public static void fibonacciSequence() {
        // Initial number
        int position1 = 0;
        // Secondary number
        int position2 = 1;
        // Number of terms
        int n = 20;
        Printer.printMessage("First "+ n +" terms: ");
        for( int i = 1; i <=n; ++i) {
            Printer.printMessage(position1 + " ");

            int sum = position1 + position2;
            position1 = position2;
            position2 = sum;
        }
    }
}
