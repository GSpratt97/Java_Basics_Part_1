package com.company;

public class Sum {
    public static void sumOfNumbers(){
        int[] arrayOfInt={1,2,3,4,5};
        int sum = 0;
        for (int i=0;i<arrayOfInt.length;i++) {
            sum += arrayOfInt[i];
            Printer.printMessage("Sum::"+sum);
        }
    }
}
