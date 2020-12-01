package com.company;

import java.util.ArrayList;

public class DataTypesAndWrapperClasses {
    // member or instance variable
    private int count;

    public static void workingWithDataTypes() {
        // If a datatype is a local variable(if defined within a method) then you have to initialise it as it will not give you any default value;
        // But if this datatype is a part of the member variable(instance variable) or it is an non-primitive datatype then it will have default values.
        // Default values -> Objects=null, int=0, float=0.0f,, double=0.0, char=\u0000, boolean=false;

        // Primitive data types
        // Integer
        byte number=1;
        short number1=2;
        int number2=24; // 4 Bytes
        long number3=67; // 8 Bytes - Larger range

        // Numbers with decimal values
        float number4=5.0f; // Precision 5-7, 4 bytes, leftmost bit is for signed value -> 0 = positive, 1 = negative numbers, f required for float, stored as: 23.45 = .2345*10^2 = mantessa and exponents
        // 1 bit is for signed and then exponents = 7bits and rest and the you have mantessa=rest of the place
        double number5=20.4; // Precision 15-16, 8 bytes

        // Characters
        char charValue65=65; // 65=A
        char charValueA='A';
        Printer.printMessage("Char Value of 65::"+charValue65);
        // ASCII 0-255 characters can be stored in 1 byte 2^8=256

        // Boolean
        boolean valueT = true;
        boolean valueF = false;

    }

    public static void workingWithWrapperClasses() {
        // int=Integer, float=Float, char=Character, byte=Byte, boolean=Boolean...


        int value1=5;
        // Boxing
        // Integer value2=new Integer(value1); -- Deprecated
        // Autoboxing - automatically the primitive type gets converted to its corresponding wrapper class(Boxed Primitives).
        Integer value3=value1;

        // Unboxing - unboxing from wrapper class to corresponding primitive type
        int value4=value3.intValue();
        // Auto-unboxing - automatically unboxing from wrapper class to corresponding primitive type
        int value5=value3;

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Numeric Promotion - If 2 data types then you basically take the larger datatype for implicit conversion.

        int intValue=20;
        float floatValue=20.5f;
        float addValue=intValue+floatValue;
        // typecasting = can lead to data loss and it is also called narrowing conversion
        int addValue1=(int)(intValue+floatValue); // Lost 0.5
        Printer.printMessage("Typecasting::"+addValue1);
        float addValue2=(float)(intValue+floatValue); // Returns float - no data loss
        Printer.printMessage("Typecasting::"+addValue2);
    }

    public static void playingWithArrays(){
        int[] arrayOfInt=new int[7]; // Index: 0 to 6
        int[] arrayOfInt1=new int[]{1,2,3,4,5};
        int[] arrayOfInt2={1,2,3,4,5};
        int[][] twoDimensionalArray={{1,2}, {3,4}, {5,6}};

        //Printer.printMessage("Value at 7th position::"+arrayOfInt[7]); // 7 out of bounds (first number is at position 0)
        Printer.printMessage("Value at 6th position::"+arrayOfInt[6]);

        // forEach loop
        for(int value:arrayOfInt){
            Printer.printMessage("Value of array::"+value); // 0
        }

        for(int i=0;i<arrayOfInt.length;i++){
            Printer.printMessage("Value at "+i+"::"+arrayOfInt[i]); // 0
        }

        int counter=5;
        int postIncrement=counter++;
        int preIncrement=++counter;
        Printer.printMessage("value::"+postIncrement); // 5
        Printer.printMessage("value2::"+preIncrement); // 7

        // Value at [2][1]
        Printer.printMessage("Value at twoDimensionalArray[2][1]::"+twoDimensionalArray[2][1]); //6

        //Array of array
        Printer.printMessage("Length of 2D::"+twoDimensionalArray.length); // 3
    }
}
