package com.company;

import java.util.Scanner;

public class Lesson11 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      Figure test1 = new Figure(3);
      test1.GetArea();


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
    //trapeze_parallelogram
    float Height;
    float Width;
    //circle
    float Radius;
    //lesson12
    static float SumArea = 0;
    static int CountFigures = 0;

    {
        SideFour = 0;
        Height = 0;
        Width = 0;
    }

    public Figure(float Radius){
        this.Radius = Radius;
        CountFigures++;
    }

    public Figure(float SideOne, float SideTwo, float SideThird){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        CountFigures++;
    }

    public Figure(float SideOne, float SideTwo, float SideThird, float SideFour){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        this.SideFour = SideFour;
        CountFigures++;
    }

    public Figure(float SideOne, float SideTwo, float SideThird, float SideFour, float Height){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        this.SideFour = SideFour;
        this.Height = Height;
        CountFigures++;
    }

    public Figure(float SideOne, float SideTwo, float SideThird, float SideFour, float Height, float Width){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        this.SideFour = SideFour;
        this.Height = Height;
        this.Width = Width;
        CountFigures++;
    }

    public void Print(){
        if (SideFour > 0){
            if(Height > 0 && Width == 0){
                System.out.println("You have Trapeze with this properties:");
                System.out.printf("Side one: %.2f\n", SideOne);
                System.out.printf("Side two: %.2f\n", SideTwo);
                System.out.printf("Side third: %.2f\n", SideThird);
                System.out.printf("Side four: %.2f\n", SideFour);
                System.out.printf("Height: %.2f\n", Height);
            }
            else if(Height > 0 && Width > 0){
                System.out.println("You have Parallelogram with this properties:");
                System.out.printf("Side one: %.2f\n", SideOne);
                System.out.printf("Side two: %.2f\n", SideTwo);
                System.out.printf("Side third: %.2f\n", SideThird);
                System.out.printf("Side four: %.2f\n", SideFour);
                System.out.printf("Height: %.2f\n", Height);
                System.out.printf("Width: %.2f\n", Width);
            }
            else {
                System.out.println("You have Rectangle with this properties:");
                System.out.printf("Side one: %.2f\n", SideOne);
                System.out.printf("Side two: %.2f\n", SideTwo);
                System.out.printf("Side third: %.2f\n", SideThird);
                System.out.printf("Side four: %.2f\n", SideFour);
            }
        }
        else {
            System.out.println("You have Triangle with this properties:");
            System.out.printf("Side one: %.2f\n", SideOne);
            System.out.printf("Side two: %.2f\n", SideTwo);
            System.out.printf("Side third: %.2f\n", SideThird);
        }
    }

    public void GetArea(){
        if (SideFour > 0 && Height == 0){
            if (SideOne == SideTwo && SideThird == SideFour){
                float area = SideOne * SideThird;
                System.out.printf("Area Rectangle is %.2f\n", area);
                SumArea += area;
            }
            else if(SideOne == SideThird && SideFour == SideTwo){
                float area = SideOne * SideTwo;
                System.out.printf("Area Rectangle is %.2f\n", area);
                SumArea += area;
            }
        }
        else if (SideFour > 0 && Height > 0){
            if (Width > 0) {
                float area = Width * Height;
                System.out.printf("Area Trapeze is %.2f", area);
                SumArea += area;
            }
            else {
                if (SideOne >= SideTwo && SideOne >= SideThird && SideOne >= SideFour){
                    float area = Height * SideOne;
                    System.out.printf("Area Parallelogram is %.2f", area);
                    SumArea += area;
                }
                else if(SideTwo >= SideOne && SideTwo >= SideThird && SideTwo >= SideFour){
                    float area = Height * SideTwo;
                    System.out.printf("Area Parallelogram is %.2f", area);
                    SumArea += area;
                }
                else if(SideThird >= SideTwo && SideThird >= SideOne && SideThird >= SideFour){
                    float area = Height * SideThird;
                    System.out.printf("Area Parallelogram is %.2f", area);
                    SumArea += area;
                }
                else if(SideFour >= SideTwo && SideFour >= SideOne && SideFour >= SideThird){
                    float area = Height * SideFour;
                    System.out.printf("Area Parallelogram is %.2f", area);
                    SumArea += area;
                }
            }

        }
        else if (Radius > 0) {
            float area = (Radius * Radius) * 3.14F;
            System.out.printf("Area Circle is %f\n", area);
            SumArea += area;
        }
        else {
            float half_perimeter = (SideOne + SideTwo + SideThird) / 2;
            float area = (float) (Math.sqrt(half_perimeter * (half_perimeter - SideOne) * (half_perimeter - SideTwo) * (half_perimeter - SideThird)));
            System.out.printf("Area Triangle is %.2f\n", area);
            SumArea += area;
        }
    }

    public void GetPerimeter(){
        if (SideFour > 0){
            float perimeter = SideOne + SideTwo + SideThird + SideFour;
            if (Height > 0 && Width == 0)
                System.out.printf("Perimeter Trapeze is %.2f\n", perimeter);
            else if(Height > 0 && Width > 0)
                System.out.printf("Perimeter Parallelogram is %.2f\n", perimeter);
            else
                System.out.printf("Perimeter Rectangle is %.2f\n", perimeter);
        }
        else if (Radius > 0){
            float length = 2 * 3.14F * Radius;
            System.out.printf("Length Circle is %.2f\n", length);
        }
        else {
            float perimeter = SideOne + SideTwo + SideThird;
            System.out.printf("Perimeter Triangle is %.2f\n", perimeter);
        }
    }

    public static void GetSumArea(){
        System.out.printf("Sum area all your figures : %f\n",SumArea);
    }

    public static void GetCountFigures(){
        System.out.printf("Count all your figures : %d\n",CountFigures);
    }

    public  void ChangeSize(float Radius){
        this.Radius = Radius;
        System.out.println("OK!");
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

    public void ChangeSize(float SideOne, float SideTwo, float SideThird, float SideFour, float Height){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        this.SideFour = SideFour;
        this.Height = Height;
        System.out.println("OK!");
    }

    public void ChangeSize(float SideOne, float SideTwo, float SideThird, float SideFour, float Height, float Width){
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
        this.SideThird = SideThird;
        this.SideFour = SideFour;
        this.Height = Height;
        this.Width = Width;
        System.out.println("OK!");
    }


}