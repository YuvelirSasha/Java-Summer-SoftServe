package com.company;

import java.util.Arrays;

public class Lesson9 {
    public static int Max(int[] array){
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    public static int Max(int first, int second){
        if(first > second)
            return first;
        else
            return second;
    }

    public static int Max(int first, int second, int third){
        if (first > second && first > third)
            return first;
        else if (second > first && second > third)
            return second;
        else if (third > first && third > second)
            return third;
        else
            return 0;
    }

    public static int LeapYear(int year){
        int daysYear = 0;
        if ((year % 4 == 0 && year % 100 > 0) || (year % 100 == 0 && year % 400 == 0)){
            System.out.println("It is LEAP YEAR");
            daysYear = 366;
            return daysYear;
        }

        else{
            System.out.println("not");
            daysYear = 365;
            return daysYear;
        }

    }

    public static int daysBetweenYears (int yearFirst, int yearSecond){
        return LeapYear(yearFirst) - LeapYear(yearSecond);
    }

    public static void printArraysTwo (int[][] array){
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void chess (int coordinateX, int coordinateY, int[][] chessboard){

        int count = 2;
        chessboard[coordinateX][coordinateY] = count;







        //right-bottom
        if ((coordinateX + 1) < chessboard.length && (coordinateY + 2) < chessboard[0].length && chessboard[coordinateX + 1][coordinateY + 2] == 1) {
            chessboard[coordinateX+ 1][coordinateY + 2] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }
        //right-top
        else if ((coordinateX - 1) < chessboard.length && (coordinateY + 2) < chessboard[0].length && chessboard[coordinateX - 1][coordinateY + 2] == 1 ) {
            chessboard[coordinateX - 1][coordinateY + 2] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }
        //bottom-right
        else if ((coordinateX + 2) < chessboard.length && (coordinateY + 1) < chessboard[0].length && chessboard[coordinateX + 2][coordinateY + 1] == 1) {
            chessboard[coordinateX + 2][coordinateY + 1] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }
        //bottom-left
        else if ((coordinateX + 2) < chessboard.length && (coordinateY - 1) < chessboard[0].length && chessboard[coordinateX + 2][coordinateY - 1] == 1) {
            chessboard[coordinateX + 2][coordinateY - 1] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }
        //top-left
        else if ((coordinateX - 2) < chessboard.length && (coordinateY + 1) < chessboard[0].length && chessboard[coordinateX - 2][coordinateY + 1] == 1) {
            chessboard[coordinateX - 2][coordinateY + 1] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }
        //top-right
        else if ((coordinateX - 2) < chessboard.length && (coordinateY - 1) < chessboard[0].length && chessboard[coordinateX - 2][coordinateY - 1] == 1) {
            chessboard[coordinateX - 2][coordinateY - 1] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }
        //left-bottom
        else if ((coordinateX + 1) < chessboard.length && (coordinateY - 2) < chessboard[0].length && chessboard[coordinateX + 1][coordinateY - 2] == 1) {
            chessboard[coordinateX + 1][coordinateY - 2] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }
        //left-top
        else if ((coordinateX - 1) < chessboard.length && (coordinateY - 2) < chessboard[0].length && chessboard[coordinateX - 1][coordinateY - 2] == 1) {
            chessboard[coordinateX - 1][coordinateY - 2] = ++count;
            chess(coordinateX, coordinateY, chessboard);
        }

    }

    public static void main(String[] args) {
        //task1
        int[] numbers = {4, 5, 6, 9, 10, 14, 5};
        System.out.println(Max(numbers));

        System.out.println(Max(5,6));

        System.out.println(Max(5, 7, 9));

        //task 2
        LeapYear(795);

        //task 3
        System.out.println(daysBerweenYears(795, 3624));
        System.out.println();

        //task 5
        System.out.println("Task 5");
        int[][] array = new int[6][6];
        chess(0,0, array);


        int coordinateX = 0;
        int coordinateY = 0;





    }
}
