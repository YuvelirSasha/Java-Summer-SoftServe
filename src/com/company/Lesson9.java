package com.company;

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

    public static int daysBerweenYears (int yearFirst, int yearSecond){
        return LeapYear(yearFirst) - LeapYear(yearSecond);
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

        //task 5
        int[][] chessboard = {{1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1,}};
    }
}
