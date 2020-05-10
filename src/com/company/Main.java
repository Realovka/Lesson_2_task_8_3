package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество звезд в треугольнике по горизонтали и вертикали ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();

        String[][] array = new String[a][a];
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                array[i][j] = "*";
            }
        }

        for (i = 0; i <= a-2; i++) {
            for (j = 0; j <= (a-2) - i; j++) {

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
