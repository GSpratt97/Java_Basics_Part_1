package com.company;

public class Switch {
    public static void switchStatement(){
        // user input in starter
        int day=4;
        // have responsibility of switch only
        // Use printer


        switch(day) {
            case 1:
                Printer.printMessage("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
