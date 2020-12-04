package com.company;

public class Loops {
    // While loop
    public static void whileLoop(int count) {

        while(count>0){
            Printer.printMessage("While Loop::"+count);
            count--;
        }
    }

    // Do while loop
    public static void doWhileLoop(int count) {

        do{
            Printer.printMessage("Do while Loop::"+count);
            count--;
        } while(count>5);
    }
}
