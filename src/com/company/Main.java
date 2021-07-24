package com.company;
import java.io.Console;
import java.util.Scanner;

public class Main {
   static Scanner number = new Scanner(System.in);

    public static void HomeWork1(){
        //task 1
        System.out.println("Task 1");
        System.out.println("Pleas input 7 numbers.");

        int number1 = number.nextInt();
        int number2 = number.nextInt();
        int number3 = number.nextInt();
        int number4 = number.nextInt();
        int number5 = number.nextInt();
        int number6 = number.nextInt();
        int number7 = number.nextInt();

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5 && number1 > number6 && number1 > number7)
            System.out.printf("%d number is the largest of all", number1);
        else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5 && number2 > number6 && number2 > number7)
            System.out.printf("%d number is the largest of all", number2);
        else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5 && number3 > number6 && number3 > number7)
            System.out.printf("%d number is the largest of all", number3);
        else if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5 && number4 > number6 && number4 > number7)
            System.out.printf("%d number is the largest of all", number4);
        else if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4 && number5 > number6 && number5 > number7)
            System.out.printf("%d number is the largest of all", number5);
        else if (number6 > number1 && number6 > number2 && number6 > number3 && number6 > number4 && number6 > number5 && number6 > number7)
            System.out.printf("%d number is the largest of all", number6);
        else if (number7 > number1 && number7 > number2 && number7 > number3 && number7 > number4 && number7 > number5 && number7 > number6)
            System.out.printf("%d number is the largest of all", number7);
        System.out.println("");

        //task 2
        System.out.println("Task 2");

        double salaryOne = 0;
        double salaryTwo = 0;
        double salaryThree = 0;


        System.out.print("Enter salary first sales person: ");
        int personOne = number.nextInt();
        System.out.print("Enter salary second sales person: ");
        int personTwo = number.nextInt();
        System.out.print("Enter salary third sales person: ");
        int personThree = number.nextInt();

        if (personOne < 500)
            salaryOne = personOne * 0.03 + personOne;
        else if (personOne >= 500 && personOne < 1000)
            salaryOne = personOne * 0.05 + personOne;
        else if (personOne >= 1000)
            salaryOne = personOne * 0.08 + personOne;
        else
            System.out.println("Fail!");

        if (personTwo < 500)
            salaryTwo = personTwo * 0.03 + personTwo;
        else if (personTwo >= 500 && personTwo < 1000)
            salaryTwo = personTwo * 0.05 + personTwo;
        else if (personTwo >= 1000)
            salaryTwo = personTwo * 0.08 + personTwo;
        else
            System.out.println("Fail!");

        if (personThree < 500)
            salaryThree = personThree * 0.03 + personThree;
        else if (personThree >= 500 && personThree < 1000)
            salaryThree = personThree * 0.05 + personThree;
        else if (personTwo >= 1000)
            salaryThree = personThree * 0.08 + personThree;
        else
            System.out.println("Fail!");

        if (salaryOne > salaryTwo && salaryOne > salaryThree){
            salaryOne += 200;
            System.out.println("First Person have bonus 200");
        }
        else if (salaryTwo > salaryOne && salaryTwo > salaryThree){
            salaryTwo += 200;
            System.out.println("Second Person have bonus 200");
        }
        else if (salaryThree > salaryOne && salaryThree > salaryTwo){
            salaryThree += 200;
            System.out.println("Third Person have bonus 200");
        }

        System.out.printf("First person have %f \n Second person have %f \n Third person have %f", salaryOne, salaryTwo, salaryThree);
        System.out.println("");

        //task 3
        System.out.println("Task 3");
        System.out.println("Enter four numbers:");
        int bignumber = number.nextInt();

        if (bignumber / 1000 > 0) {
            int chislo4 = bignumber % 10;
            int chislo3 = (bignumber % 100) / 10;
            int chislo1 = bignumber / 1000;
            int chislo2 = (bignumber % 1000) / 100;
            System.out.println("Your number: " + chislo2 + chislo1 + chislo4 + chislo3);
        } else
            System.out.println("Fail!");
    }
    public static void Lesson4() {
        //task 1
        System.out.println("Task 1");
        System.out.print("Input number: ");
        int task1_number = number.nextInt();
        if (task1_number % 2 == 0)
            System.out.println("Is a Even numberrr!");
        else
            System.out.println("Not it is not even number");
        System.out.println(" ");

        //task 2
        System.out.println("Task 2");
        System.out.println("Print your year: ");
        int year = number.nextInt();

        if ((year % 4 == 0 && year % 100 > 0) || (year % 100 == 0 && year % 400 == 0))
            System.out.println("It is leap year!");
        else
            System.out.println("your year is  not leap");
        System.out.println(" ");


        //task 3
        System.out.println("Task 3");
        Scanner BobNumber = new Scanner(System.in);

        System.out.println("Print number of menu");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        int answer = BobNumber.nextInt();
        switch (answer) {
            case 1:
                System.out.print("Enter Bob income: ");
                int income = BobNumber.nextInt();
                System.out.print("Input Bob number of times he arrived late: ");
                int timesArrivedLate = (BobNumber.nextInt() / 3) * 20;
                System.out.println("Bob has worked: " + (income - timesArrivedLate) * 50 / 100);
                break;
            case 2:
                System.out.print("Enter number of lines of code written by Bob: ");
                int linecode = BobNumber.nextInt();
                System.out.print("Enter Bob income: ");
                int income_case2 = BobNumber.nextInt();
                System.out.println("How much Bob must arrived late for desired salary: " + (income_case2 / 20) * 3);
                System.out.println("How much Bob must arrived late for line code: " + ((linecode * 50 / 100) / 20 * 3));
                break;
            case 3:
                System.out.print("Enter number of lines of code written by Bob: ");
                int linecode_case3 = BobNumber.nextInt();
                System.out.print("Enter Bob number of times he arrived late: ");
                int timesArrivedLate_case3 = (BobNumber.nextInt() / 3) * 20;
                System.out.println("Money Bob will be paid: " + (linecode_case3 * 50 / 100 - timesArrivedLate_case3));
        }
    }
    public static void Lesson5() {
        //task 1
        System.out.print("Enter number: ");
        int displayNumber = number.nextInt();
        for(int i =0; i <= displayNumber; i++){
            System.out.println(i);
        }

        //task 2
        System.out.print("Enter first number: ");
        int firstNumber = number.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = number.nextInt();

        if (firstNumber > secondNumber) {
            for (int i = secondNumber; secondNumber <= firstNumber; secondNumber++) {
                System.out.println(secondNumber);
                if (secondNumber % 2 == 0) {
                    System.out.println(secondNumber);
                }
            }
        }
        else
        {
            for (int i = firstNumber; firstNumber <= secondNumber; firstNumber++) {
                System.out.println(firstNumber);
                if (firstNumber % 2 != 0) {
                    System.out.println(firstNumber);
                }

                if(firstNumber % 7 ==0)
                    System.out.println(firstNumber);
            }
        }

        //task 3

        System.out.print("Enter first number: ");
        int firstNumber_2 = number.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber_2 = number.nextInt();
        int sum = 0;
        for(int i = secondNumber_2; secondNumber_2 <= firstNumber_2; secondNumber_2++)
        {
            sum += secondNumber_2;
            System.out.println(sum);
        }

        //task 4
        int count = 0;
        int nUMBER = 1;
        while (nUMBER != 0) {
            System.out.print("Enter numbers: ");
            nUMBER = number.nextInt();
            count++;
            System.out.println(count);
        }

        //task 5

        System.out.print("Enter first side rectangle: ");
        int sidefirst = number.nextInt();

        System.out.print("Enter second side rectangle: ");
        int sidesecond = number.nextInt();

        System.out.print("Enter made of the given symbol: ");
        String symbol = number.next();

        for(int i = 1; i <= sidefirst; i++)
        {
            for (int j = 1; j < sidesecond; j++)
                System.out.print(symbol);
            System.out.println(symbol);

        }

        //task 6

        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";

        System.out.print("Enter first side rectangle: ");
        int sidefirst_2 = number.nextInt();

        System.out.print("Enter second side rectangle: ");
        int sidesecond_2 = number.nextInt();

        System.out.print("Enter made of the given symbol: ");
        String symbol_2 = number.next();

        System.out.print("Enter the color of the rectangle: ");
        String color = number.next();

        switch (color) {
            case "blue":
                for (int i = 0; i < sidefirst_2; i++) {
                    for (int j = 0; j < sidesecond_2; j++) {
                        if (i == 0 || j == 0 || i == sidefirst_2 - 1 || j == sidesecond_2 - 1)
                            System.out.print(symbol_2 + ANSI_BLUE);
                        else
                            System.out.print(" ");
                    }
                    System.out.println(" ");
                }
                break;

            case "red":
                for (int i = 0; i < sidefirst_2; i++) {
                    for (int j = 0; j < sidesecond_2; j++) {
                        if (i == 0 || j == 0 || i == sidefirst_2 - 1 || j == sidesecond_2 - 1)
                            System.out.print(symbol_2 + ANSI_RED);
                        else
                            System.out.print(" ");
                    }
                    System.out.println(" ");
                }
                break;
            default:
                for (int i = 0; i < sidefirst_2; i++) {
                    for (int j = 0; j < sidesecond_2; j++) {
                        if (i == 0 || j == 0 || i == sidefirst_2 - 1 || j == sidesecond_2 - 1)
                            System.out.print(symbol_2);
                        else
                            System.out.print(" ");
                    }
                    System.out.println(" ");
            }
        }}
    public static void main(String[] args) {
        //task 1
        System.out.print("Enter your number: ");
        int NuMbEr = number.nextInt();
        int unit_1 = 0;
        int unit_2 = 0;
        int unit_3 = 0;
        int unit_4 = 0;
        int unit_5 = 0;
        int sum = 0;
        int avg = 0;

        if (NuMbEr / 10000 > 0){
            unit_1 = NuMbEr / 10000;
            unit_2 = (NuMbEr % 10000) / 1000;
            unit_3 = (NuMbEr % 1000) / 100;
            unit_4 = (NuMbEr % 100) / 10;
            unit_5 = NuMbEr % 10;

            sum = unit_1 + unit_2 + unit_3 + unit_4 + unit_5;
            avg = sum / 5;

            //for (int i =0; i < 4; i++){
            //    if(unit_i == 0)
            //}
            System.out.println("Your number consists of five number.");
        }
        else if(NuMbEr / 1000 > 0){
            unit_1 = NuMbEr / 1000;
            unit_2 = (NuMbEr % 1000) / 100;
            unit_3 = (NuMbEr % 100) / 10;
            unit_4 = NuMbEr % 10;
            sum = unit_1 + unit_2 + unit_3 +unit_4;
            avg = sum / 4;
            System.out.println("Your number consists of four number.");
        }
        else if(NuMbEr / 100 > 0){
            unit_1 = NuMbEr / 100;
            unit_2 = (NuMbEr % 100) / 10;
            unit_3 = NuMbEr % 10;
            sum = unit_1 + unit_2 + unit_3;
            avg = sum / 3;
            System.out.println("Your number consists of thee number.");
        }
        else if(NuMbEr / 10 > 0){
            unit_1 = NuMbEr / 10;
            unit_2 = NuMbEr % 10;
            sum = unit_1 + unit_2;
            avg = sum / 2;
            System.out.println("Your number consists of two number.");
        }
        else if(NuMbEr / 1 > 0){
            unit_1 = NuMbEr;
            System.out.println("Your number consists of one number.");
        }
        //i think about this.....




        //task 2
        System.out.print("Enter height array: ");
        int count = number.nextInt();
        for (int i = 0; i < count / 2; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("***___");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < count / 2; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("___***");
            }
            System.out.println(" ");
        }



    }}