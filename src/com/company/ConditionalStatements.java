package com.company;

public class ConditionalStatements {

    public static void applyingConditionalStatements(){
        int number1=6;
        int number2=7;
        // Write a program that whichever number is larger is printed

        if(number1>number2) {
            Printer.printMessage("Largest number::"+number1);
        } else {
            Printer.printMessage("Largest number::"+number2);
        }

        //ternary operator
        int largest=number1>number2?number1:number2;
        Printer.printMessage("Largest value using ternary operator::"+largest);
    }
}
