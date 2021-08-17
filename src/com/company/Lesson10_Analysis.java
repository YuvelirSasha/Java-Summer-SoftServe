package com.company;
import java.util.Scanner;

public class Lesson10_Analysis {
    public static void main(String[] args) {

        PrintStars(10);
        System.out.println();
        //PrintStarsRecursiv(10);

        final int length = 6;
        int[][] field = new int[length][length];

        FindPathOnChessboard(field, 2, 2);

        for (int r = 0; r < length; r++) {
            for (int c = 0; c < length; c++) {
                System.out.print(field[r][c] + "\t");
            }
            System.out.println();
        }
    }
    public static void PrintStars(int num) // 10
    {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
    public static void PrintStarsRecursiv(int num)
    {
        if (num <= 0) return;

        System.out.print("*");
        PrintStarsRecursiv(num - 1);
    }

    // filed cell: true - was the knight
    //             false - was not the knight
    public static boolean FindPathOnChessboard(int[][] field, int y, int x) {

        final int nextStep = field[y][x] + 1;
        if (nextStep > field.length * field.length)
            return true;

        final int length = field.length;

        if (y - 2 >= 0 && x + 1 < length && field[y - 2][x + 1] == 0) {
            // try this cell
            field[y - 2][x + 1] = nextStep;
            if (FindPathOnChessboard(field, y - 2, x + 1) == false)
                field[y - 2][x + 1] = 0;
            else return true;
        }
        if (y - 1 >= 0 && x + 2 < length && field[y - 1][x + 2] == 0) {
            field[y - 1][x + 2] = nextStep;
            if (FindPathOnChessboard(field, y - 1, x + 2) == false)
                field[y - 1][x + 2] = 0;
            else return true;
        }
        if (y + 1 < length && x + 2 < length && field[y + 1][x + 2] == 0) {
            field[y + 1][x + 2] = nextStep;
            if (FindPathOnChessboard(field, y + 1, x + 2) == false)
                field[y + 1][x + 2] = 0;
            else return true;
        }
        if (y + 2 < length && x + 1 < length && field[y + 2][x + 1] == 0) {
            field[y + 2][x + 1] = nextStep;
            if (FindPathOnChessboard(field, y + 2, x + 1) == false)
                field[y + 2][x + 1] = 0;
            else return true;
        }
        //------------------------
        if (y + 2 < length && x - 1 >= 0 && field[y + 2][x - 1] == 0) {
            field[y + 2][x - 1] = nextStep;
            if (FindPathOnChessboard(field, y + 2, x - 1) == false)
                field[y + 2][x - 1] = 0;
            else return true;

        }
        if (y + 1 < length && x - 2 >= 0 && field[y + 1][x - 2] == 0) {
            field[y + 1][x - 2] = nextStep;
            if (FindPathOnChessboard(field, y + 1, x - 2) == false)
                field[y + 1][x - 2] = 0;
            else return true;
        }
        if (y - 1 >= 0 && x - 2 >= 0 && field[y - 1][x - 2] == 0) {
            field[y - 1][x - 2] = nextStep;
            if (FindPathOnChessboard(field, y - 1, x - 2) == false)
                field[y - 1][x - 2] = 0;
            else return true;
        }
        if (y - 2 >= 0 && x - 1 >= 0 && field[y - 2][x - 1] == 0) {
            field[y - 2][x - 1] = nextStep;
            if (FindPathOnChessboard(field, y - 2, x - 1) == false)
                field[y - 2][x - 1] = 0;
            else return true;
        }

        return false;
    }
}
