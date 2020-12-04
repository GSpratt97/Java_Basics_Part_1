package com.company;

public class Fibonacci {
    public static void fibonacciSequence(int position1, int position2, int numberOfTerms) {
        Printer.printMessage("First "+ numberOfTerms +" terms: ");
        for( int i = 1; i <=numberOfTerms; ++i) {
            Printer.printMessage(position1 + " ");

            int sum = position1 + position2;
            position1 = position2;
            position2 = sum;
        }
    }
}
