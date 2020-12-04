package com.company;

public class Swap {
    public static void swapNumbers(int value1, int value2){

        // Assign temporary value
        int valueTemp = value2;

        // Reassign values
        value2 = value1;
        value1 = valueTemp;


        Printer.printMessage("New value1::"+value1);
        Printer.printMessage("New value2::"+value2);
    }
}
