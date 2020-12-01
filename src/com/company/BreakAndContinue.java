package com.company;

public class BreakAndContinue {
    public static void breakStatement() {
        int[] first = {1,2,3,4,5};
        int[] second = {6,7,8,9,10};
        int[] third = {11,12,13,14,15};
        int[][] all = {first, second, third};

        for (int[] array:all) {
            for (int i=0;i<5;i++) {
                int check = array[i]*5;
                if (check%2 == 0) {
                    break; // Breaks from present loop (unless there is a label)
                }
                Printer.printMessage("Excercise1::"+check);
            }
        }
    }

    public static void breakStatement2() {
        int[] first = {1,2,3,4,5};
        int[] second = {6,7,8,9,10};
        int[] third = {11,12,13,14,15};
        int[][] all = {first, second, third};

        checkEvens:for (int[] array:all) {
            for (int i=0;i<5;i++) {
                int check = array[i]*5;
                if (check%2 == 0) {
                    break checkEvens; // Breaks from present loop (unless there is a label)
                }
                Printer.printMessage("Excercise2::"+check);
            }
        }
    }

    public static void breakStatement3() {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {6, 7, 8, 9, 10};
        int[] third = {11, 12, 13, 14, 15};
        int[][] all = {first, second, third};

        for (int[] array : all) {
            for (int i = 0; i < 5; i++) {
                int check = array[i] * 5;
                if (check % 2 == 0) {
                    continue; // Breaks from present loop (unless there is a label)
                }
                Printer.printMessage("Excercise3::" + check);
            }
        }
    }

    public static void breakStatement4() {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {6, 7, 8, 9, 10};
        int[] third = {11, 12, 13, 14, 15};
        int[][] all = {first, second, third};

        checkEven:for (int[] array : all) {
            for (int i = 0; i < 5; i++) {
                int check = array[i] * 5;
                if (check % 2 == 0) {
                    continue checkEven; // Breaks from present loop (unless there is a label)
                }
                Printer.printMessage("Excercise4::" + check);
            }
        }
    }
}
