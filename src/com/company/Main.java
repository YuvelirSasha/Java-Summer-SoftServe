package com.company;
import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner number = new Scanner(System.in);

    public static void HomeWork1() {
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

        if (salaryOne > salaryTwo && salaryOne > salaryThree) {
            salaryOne += 200;
            System.out.println("First Person have bonus 200");
        } else if (salaryTwo > salaryOne && salaryTwo > salaryThree) {
            salaryTwo += 200;
            System.out.println("Second Person have bonus 200");
        } else if (salaryThree > salaryOne && salaryThree > salaryTwo) {
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

    public static void HomeWork2() {
        //task 1
        System.out.println("Task 1");
        int l = 0;
        String end = "stop";
        String all_number = "";
        int SUM = 0;
        int AVG = 0;
        int count_zero = 0;

        while (l != -1) {
            System.out.print("Enter your number: ");
            String NuMbEr = number.nextLine();
            System.out.println("Enter \"stop\" for close app");

            if(NuMbEr.equals(end))
                break;

            all_number += NuMbEr;
            if(Integer.parseInt(NuMbEr) == 0)
                count_zero++;
            l++;
            SUM += Integer.parseInt(NuMbEr);
            AVG = SUM / l;
        }
        System.out.printf("Your number is %s\nArithmetic mean number turned out: %d\nSum number turned out: %d\nAnd your number has %d" +
                " zeros\n", all_number, AVG, SUM, count_zero);
        System.out.println(" ");



        //task 2
        System.out.println("Task 2");
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
        for (int i = 0; i <= displayNumber; i++) {
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
        } else {
            for (int i = firstNumber; firstNumber <= secondNumber; firstNumber++) {
                System.out.println(firstNumber);
                if (firstNumber % 2 != 0) {
                    System.out.println(firstNumber);
                }

                if (firstNumber % 7 == 0)
                    System.out.println(firstNumber);
            }
        }

        //task 3

        System.out.print("Enter first number: ");
        int firstNumber_2 = number.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber_2 = number.nextInt();
        int sum = 0;
        for (int i = secondNumber_2; secondNumber_2 <= firstNumber_2; secondNumber_2++) {
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

        for (int i = 1; i <= sidefirst; i++) {
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
        }
    }

    public static void Lesson6() {
        //task 1
        System.out.println("Task 1");
        int count = 1;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        int avg = sum / 1000;
        System.out.println(avg);
        System.out.println();

        //task 2
        System.out.println("Task 2");
        System.out.print("Enter your number: ");
        int NumBER = number.nextInt();
        while (true) {
            if (NumBER > 20 || NumBER < 1) {
                System.out.print("Enter your number: ");
                NumBER = number.nextInt();
            } else {
                sum = 0;
                for (int i = NumBER; i <= 20; i++) {
                    sum += i;
                }
                System.out.printf("Your sum is: %d\n", sum);
                break;
            }
        }
        System.out.println();

        //task 3
        System.out.println("Task 3");
        System.out.print("Enter your number: ");
        NumBER = number.nextInt();
        int product = 0;
        for (int i = 1; i <= 10; i++) {
            product = NumBER * i;
            System.out.printf("%d * %d = %d\n", NumBER,i, product);
        }
        System.out.println();

        //task 4
        System.out.println("Task 4");
        System.out.print("Enter your number: ");
        NumBER = number.nextInt();

        for (int i = 1; i < NumBER ; i++) {
            if (NumBER % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //task 5
        System.out.println("Task 5");
        int l = 0;
        String end = "stop";
        String all_number = "";
        int SUM = 0;
        int AVG = 0;
        int count_zero = 0;

        while (l != -1) {
            System.out.print("Enter your number: ");
            String linee = number.next();
            System.out.println("Enter \"stop\" for close app");

            if(linee.equals(end))
                break;

            all_number += linee;
            if(Integer.parseInt(linee) == 0)
                count_zero++;
            l++;
            SUM += Integer.parseInt(linee);
            AVG = SUM / l;
        }
        System.out.printf("Your number is %s\nArithmetic mean number turned out: %d\nSum number turned out: %d\nAnd your number has %d" +
                " zeros\n", all_number, AVG, SUM, count_zero);
        System.out.println("");


    }

    public static void Lesson7() {
        //task 1
        System.out.println("Task 1");
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[4 - i] + " ");
        }
        System.out.println();

        //task 2
        System.out.println("Task 2");
        int[] pentagonSides = new int[5];
        int perimeter = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter length side your pentagon: ", i);
            pentagonSides[i] = number.nextInt();
            perimeter += pentagonSides[i];
        }
        System.out.println("Perimeter your pentagon is: " + perimeter);
        System.out.println();

        //task 3
        System.out.println("Task 3");
        int[] profitYear = new int[11];
        int max = 0;
        int min = 999999999;

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter your profit for a month: ");
            profitYear[i] = number.nextInt();
            if(max < profitYear[i])
                max = profitYear[i];
            if(min > profitYear[i])
                min = profitYear[i];
        }
        System.out.printf("Your max %d, Your minimum %d", max, min);
        System.out.println();


        //task 4
        System.out.println("Task 4");
        System.out.print("How much your array has numbers: ");
        int NNumberr = number.nextInt();

        int[] randomArray = new int[NNumberr];
        int sumNegative = 0;
        int maxRandom = 0;
        int minRandom = -1;
        int evenNumbers = 1;
        int maxNegative = -999999999;
        int minNegative = -1;

        for (int i = 0; i < NNumberr; i++) {
            System.out.print("Enter your number: ");
            randomArray[i] = number.nextInt();

            if (randomArray[i] < 0){
                sumNegative += randomArray[i];
                if (randomArray[i] > maxNegative)
                    maxNegative = randomArray[i];
                if(randomArray[i] < minNegative)
                    minNegative = randomArray[i];
            }


            if(maxRandom < randomArray[i])
                maxRandom = randomArray[i];
            if(minRandom > randomArray[i])
                minRandom = randomArray[i];

            if(randomArray[i] % 2 == 0)
                evenNumbers *= randomArray[i];

        }

        System.out.printf("The sum of negative elements: %d\n" +
                "The product of elements between min and max elements: %d\n" +
                "The product of elements with even numbers: %d\n" +
                "The sum of elements between the first and last negative elements: %d\n", sumNegative, maxRandom * minRandom, evenNumbers, maxNegative + minNegative);
        System.out.println();

        //task 7
        System.out.println("Task 7");
        System.out.println("We have array: ");
        int[] movingArray = {4, 6, 0, 8, 0, 1, 3, 0, 1};

        for (int i = 0; i < movingArray.length; i++) {
            System.out.print(movingArray[i]+ " ");
        }
        System.out.println();

        for(int k = 0; k < movingArray.length - 1; ++k){
            for (int i = 0; i < movingArray.length - 1 - k; i++) {

                if(movingArray[i] == 0){
                    int number = movingArray[i];
                    movingArray[i] = movingArray[i + 1];
                    movingArray[i + 1] = number;
                }

            }
        }

        System.out.println("And after sort his we have:");
        for (int i = 0; i < movingArray.length; i++) {
            if (movingArray[i] == 0)
                movingArray[i] = -1;
            System.out.print(movingArray[i]+ " ");
        }

        //task 5
        System.out.println("Task 5");
        System.out.println("Insertion Sort");

        int[] arrayInsertion = {5, 4, 9, 7, 3, 1, 4, 9, 4, 5};

        for (int i = 0; i < arrayInsertion.length; ++i) {
            int key = arrayInsertion[i];
            int j = i - 1;

            while (j >= 0 && arrayInsertion[j] > key) {
                arrayInsertion[j + 1] = arrayInsertion[j];
                j = j -1;
            }
            arrayInsertion[j + 1] = key;
        }

        for (int i = 0; i < arrayInsertion.length; i++) {
            System.out.println(arrayInsertion[i]);
        }

        System.out.println();

        //task 6
        System.out.println("Task 6");
        int[] rrandomArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();

        System.out.println("We have this array: ");
        for (int i: rrandomArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < rrandomArray.length; i++) {
            int rand = random.nextInt(9);
            int z = rrandomArray[rand];
            rrandomArray[rand] = rrandomArray[i];
            rrandomArray[i] = z;
        }

        for (int i: rrandomArray) {
            System.out.print(i + " ");
        }
    }

    public static void Lesson8_Task1 (int height, int width){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width - 1; j++) {
                System.out.print(0);
            }
            System.out.println(0);
        }
    }

    public static void Lesson8_Task2 (int f) {
        int num = 1;
        for (int i = 1; i < f + 1; i++) {
            num = num * i;
        }
        System.out.println("Your factorial is: " + num);
    }

    public static void Lesson8_Task3 (int n){
        int count = 0;
        for (int i = 1; i < 100; i++) {
            int number = n % i;
            if(number == 0)
                count++;
        }
        if(count == 2)
            System.out.println("It is prime number");
        else
            System.out.println("It is not prime number");
    }

    public static void Lesson8_Task4 (int number){
        System.out.println("Cube of your number is: " + number * number * number);
    }

    public static void Lesson8_Task5 (int first, int second){
       int sum = 0;

        for (int i = first; i <= second; i++) {
            sum += i;
        }

        System.out.println("Sum of your range is: " + sum);
    }

    public static void Lesson8_Task6 (int[] array){
        int max = 0;
        int min = 9999999;
        int count = array.length;

        for (int i: array) {
            if(i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.printf("Max in your array is a %d and Min a %d. Length array is %d", max, min, count );
    }

    public static void Lesson8_Task7 (int[] array) {

        for (int i = 0; i < array.length - 1; ++i) {
            if(i % 2 != 0) {
                int hlp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = hlp;
            }
            if(array.length % 2 ==0){
                int hlp = array[0];
                array[0] = array[array.length-1];
                array[array.length-1] = hlp;
            }

        }

        System.out.println("Refresh your array:");
        for (int i: array) {
            System.out.print(i + " ");
        }

    }

    public static void Lesson8_Task8 (int[] array){
        int count = 0;

        for (int j: array) {
            int hlp = 0;
            for (int i = 1; i < 100; i++) {
                int number = j % i;
                if(number == 0)
                    hlp++;
            }
            if(hlp == 2)
                count++;
        }

        System.out.println("Your array have count primal numbers: " + count);
    }

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arrayyyyy = new int[rnd.nextInt(10)];

        for (int i = 0; i < arrayyyyy.length; i++) {
            arrayyyyy[i] = rnd.nextInt(101);
            System.out.print(arrayyyyy[i] + " ");
        }
        System.out.println();

        Lesson8_Task8(arrayyyyy);
    }
}