package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][4];
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                array[i][j] = "*";
            }
        }

        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 2 - i; j++) {

                array[i][j] = " ";

            }
        }

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
