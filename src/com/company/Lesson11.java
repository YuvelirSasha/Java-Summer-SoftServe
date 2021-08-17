package com.company;

import java.util.Scanner;

public class Lesson11 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Figure test = new Figure(5, 5, 8, 8);
        test.GetPerimeter();
        test.ChangeSize(5,5,5,5);
        test.Print();

    }
}

class Conditioner {
    static Scanner scanner = new Scanner(System.in);
    private String model;
    private int mode; //  1 - easy 2 - medium 3 - very hard work
    private float power; // min-0 max-35
    private int temperature;
    private boolean state;

    public Conditioner(String model, int mode, float power, int temperature, boolean state){
        this.model = model;
        this.mode = mode;
        this.power = power;
        this.temperature = temperature;
        this.state = state;
    }

    public void OnConditioner(){
        state = true;
        System.out.println("Conditioner is start work");
    }

    public void OfConditioner(){
        state = !state;
        System.out.println("Conditioner is turned off");
    }

    public void UpMode() {
        if (mode < 3) {
            mode++;
            System.out.printf("Mode Conditioner: %d\n", mode);
        }
    }

    public void DownMode() {
        if (mode > 0) {
            mode--;
            System.out.printf("Mode Conditioner: %d\n", mode);
        }
    }

    public void RegulationPower(float tem) {
        for (int i = 0; i < 1000; i++) {
            if (tem >= 0 && tem <= 35)
            {
                power = tem;
                System.out.printf("Conditioner work on %.2f power\n", power);
                break;
            }
            else
            {
                System.out.println("Your power very high or low for conditioner please enter new in this within [0 - 35]");
                float help = scanner.nextFloat();
                tem = help;
                RegulationPower(help);
            }
        }
    }

    public void ChangeTemperature() {
        System.out.print("Enter ten or units for change temperature: ");
        int ChangeTem = scanner.nextInt();

        if (ChangeTem / 10 > 1) {
            temperature += 10;
            System.out.printf("Temperature in conditioner is %d",temperature);
        }
        else if (ChangeTem / 10 == 0 && ChangeTem > 1) {
            temperature += 5;
            System.out.printf("Temperature in conditioner is %d", temperature);
        }
        else if (ChangeTem / 10 == 0 && ChangeTem < 1) {
            temperature -= 5;
            System.out.printf("Temperature in conditioner is %d",temperature);
        }
        else if (ChangeTem / 10 < 0) {
            temperature -= 10;
            System.out.printf("Temperature in conditioner is %d",temperature);
        }
    }

    public void ChangeNameConditioner(String name) {
        model = name;
        System.out.println("Now model your conditioner is " + model);
    }

}

class Figure{
    //triangle
    float SideOne;
    float SideTwo;
    float SideThird;
    //rectangle
    float SideFour;

    public Figure(float SideOne, float SideTwo, float SideThird){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
    }

    public Figure(float SideOne, float SideTwo, float SideThird, float SideFour){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        this.SideFour = SideFour;
    }

    public void Print(){
        if (SideFour > 0){
            System.out.println("You have Rectangle with this properties:");
            System.out.printf("Side one: %.2f\n", SideOne);
            System.out.printf("Side two: %.2f\n", SideTwo);
            System.out.printf("Side third: %.2f\n", SideThird);
            System.out.printf("Side four: %.2f\n", SideFour);
        }
        else {
            System.out.println("You have Triangle with this properties:");
            System.out.printf("Side one: %.2f\n", SideOne);
            System.out.printf("Side two: %.2f\n", SideTwo);
            System.out.printf("Side third: %.2f\n", SideThird);
        }
    }

    public void GetArea(){
        if (SideFour > 0){
            if (SideOne == SideTwo && SideThird == SideFour){
                float area = SideOne * SideThird;
                System.out.printf("Area Rectangle is %.2f\n", area);
            }
            else if(SideOne == SideThird && SideFour == SideTwo){
                float area = SideOne * SideTwo;
                System.out.printf("Area Rectangle is %.2f\n", area);
            }
        }
        else {
            float perimeter = (SideOne + SideTwo + SideThird) / 2;
            float area = (float) (Math.sqrt(perimeter * (perimeter - SideOne) * (perimeter - SideTwo) * (perimeter - SideThird)));
            System.out.printf("Area Triangle is %.2f\n", area);
        }
    }

    public void GetPerimeter(){
        if (SideFour > 0){
            float perimeter = SideOne + SideTwo + SideThird + SideFour;
            System.out.printf("Perimeter Rectangle is %.2f\n", perimeter);
        }
        else {
            float perimeter = SideOne + SideTwo + SideThird;
            System.out.printf("Perimeter Triangle is %.2f\n", perimeter);
        }
    }

    public void ChangeSize(float SideOne, float SideTwo, float SideThird){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        System.out.println("OK!");
    }

    public void ChangeSize(float SideOne, float SideTwo, float SideThird, float SideFour){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        this.SideFour = SideFour;
        System.out.println("OK!");
    }


}