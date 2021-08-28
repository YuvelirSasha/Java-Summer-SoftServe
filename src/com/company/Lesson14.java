package com.company;
public class Lesson14 {
    public static void main(String[] args) {
       //Task1
        //Circle p = new Circle("bigCircle", "circle", 1, 5);
        //Rectangle a = new Rectangle("smoleRectangle", "square", 4, 4, 4, 4, 4, 4);
        //Triangle c = new Triangle("midleTriangle", "triangle", 3, 6, 8, 18);

        //TestAre(p);
        //TestAre(a);
        //TestAre(c);

       //Task2
        Monitor monitor = new Monitor();
        Printer p = new Printer();
        Comp cmp = new Comp(1, 2);
        Disk cd = new CD("Very secret",3468,true );
        cmp.AddDevice(0, monitor);
        cmp.AddDevice(1, p);
        cmp.AddDisk(0, cd);
        cmp.ShowDisk();
        cmp.ShowPrintDevice();
    }

    public static void TestAre(Shape shape){
        shape.Show();
        shape.GetArea();
    }
}
//task1
abstract class Shape{
    protected String name;
    protected String type;
    protected int sites;

    Shape(String name, String type, int sites){
        this.name = name;
        this.type = type;
        this.sites = sites;
    }

    public void Show(){
        System.out.printf("Name: %s\n", name);
        System.out.printf("Type: %s\n", type);
        System.out.printf("Sites: %d\n", sites);
    }

    public void GetArea(){

    }
}

class Triangle extends Shape{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    Triangle(String name, String type, int sites, double firstSide, double secondSide, double thirdSide){
        super(name, type, sites);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void Show(){
        super.Show();
        System.out.printf("First side: %f\n", firstSide);
        System.out.printf("Second side: %f\n", secondSide);
        System.out.printf("Third side: %f\n", thirdSide);
    }

    @Override
    public void GetArea(){
        double p = (firstSide + secondSide + thirdSide)/ 2;
        double area = Math.sqrt(p * (p - firstSide) * ( p - secondSide) * (p - thirdSide));
        System.out.printf("Area: %f\n", area);
    }
}

class Rectangle extends Shape{
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double fourthSide;
    private double height;

    Rectangle(String name, String type, int sites, double firstSide, double secondSide, double thirdSide, double fourthSide, double height){
        super(name, type, sites);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
        this.height = height;
    }

    @Override
    public void Show(){
        super.Show();
        System.out.printf("First side: %f\n", firstSide);
        System.out.printf("Second side: %f\n", secondSide);
        System.out.printf("Third side: %f\n", thirdSide);
        System.out.printf("Four side: %f\n", fourthSide);
        System.out.printf("Height: %f\n", height);
    }

    @Override
    public void GetArea(){
        double area = firstSide * secondSide;
        System.out.printf("Are: %f", area);
    }

}

class Circle extends Shape{
    private double radius;
    private final double PI = 3.14;

    Circle(String name, String type, int sites, double radius){
        super(name, type, sites);
        this.radius = radius;
    }

    @Override
    public void Show(){
        super.Show();
        System.out.printf("Radius: %f\n", radius);
    }

    @Override
    public void GetArea(){
        double area = PI * (radius * radius);
        System.out.printf("Area: %f", area);
    }
}
//task2

class Comp{
    protected int countDisk;
    protected int countPrintDevice;
    protected Disk[] disks;
    protected IPrintInformation[] printDevice;



    Comp(int d, int pd){
        countDisk = d;
        countPrintDevice = pd;
        disks = new Disk[10];
        printDevice = new IPrintInformation[10];
    }

    public void AddDevice(int index, IPrintInformation si){
        printDevice[index] = si;
        System.out.println("We found a new Print Device");
    }

    public void AddDisk(int index, Disk d){
        disks[index] = d;
        System.out.println("We found a new Disk");
    }

    public boolean CheckDisk(String device){
        for (int i = 0; i < disks.length; i++) {
            if (device.equals(disks[i].GetName())) {
                return true;
            }
        }
        return false;
    }

    public void InsertReject(String device, boolean b){
        if (b){
            System.out.printf("Device %s Insert\n", device);
        }
        else
            System.out.printf("Device %s Reject\n", device);
    }

    public boolean PrintInfo(String text, String device){
        for (int i = 0; i < printDevice.length; i++) {
            if (device.equals(printDevice[i].GetName())) {
                printDevice[i].Print(text);
                return true;
            }
        }
        return false;
    }

    public String ReadInfo(String device){
        if(CheckDisk(device))
            return "Reading";
        return "Fail";
    }

    public void ShowDisk(){
        for (int i = 0; i < countDisk; i++) {
            System.out.println(disks[i].GetName());
        }
    }

    public void ShowPrintDevice(){
        for (int i = 0; i < countPrintDevice; i++) {
            System.out.println(printDevice[i].GetName());
        }
    }

    public boolean WriteInfo(String text, String showDevice){
        return false;
    }


}

abstract class Disk implements IDisk{
    protected String memory;
    protected int memSize;

    Disk(){
        memory = "000000";
        memSize = 10;
    }

    Disk(String memory, int memSize){
        this.memory = memory;
        this.memSize = memSize;
    }

    public String GetName(){
        return "Special Disk";
    }

    @Override
    public String Read() {
        return "Disk read!";
    }

    @Override
    public void Write(String text) {
        System.out.println(text);
    }
}

class Printer implements IPrintInformation{

    @Override
    public String GetName() {
        return "Printer!";
    }

    @Override
    public void Print(String str) {
        System.out.println(str);
    }
}

class Monitor implements IPrintInformation{

    @Override
    public String GetName() {
        return "Monitor!";
    }

    @Override
    public void Print(String str) {
        System.out.println(str);
    }
}

class HDD extends Disk{

    @Override
    public String GetName(){
        return "It HDD!";
    }
}

class DVD extends Disk implements IRemovableDisk{

    private boolean hasDisk = false;

    @Override
    public boolean HasDiskGet() {
        if (hasDisk != true){
            Insert();
            return hasDisk = true;
        }
        else {
            Reject();
            return hasDisk = false;
        }
    }

    @Override
    public void Insert() {
        System.out.println("DVD insert.");
    }

    @Override
    public void Reject() {
        System.out.println("DVD reject.");
    }

    @Override
    public String GetName(){
        return "It is DVD!";
    }
}

class Flash extends Disk implements IRemovableDisk{

    private boolean hasDisk = false;

    @Override
    public boolean HasDiskGet() {
        if (hasDisk != true){
            Insert();
            return hasDisk = true;
        }
        else {
            Reject();
            return hasDisk = false;
        }
    }

    @Override
    public void Insert() {
        System.out.println("Flash insert.");
    }

    @Override
    public void Reject() {
        System.out.println("Flash reject.");
    }

    @Override
    public String GetName(){
        return "Flash!";
    }
}

class CD extends Disk implements IRemovableDisk{

    private boolean hasDisk = false;

    CD(String memory, int memSize, boolean hasDisk){
        super(memory, memSize);
        this.hasDisk = hasDisk;
    }

    @Override
    public boolean HasDiskGet() {
        if (hasDisk != true){
            Insert();
            return hasDisk = true;
        }
        else {
            Reject();
            return hasDisk = false;
        }
    }

    @Override
    public void Insert() {
        System.out.println("Cd insert.");
    }

    @Override
    public void Reject() {
        System.out.println("CD reject.");
    }

    @Override
    public String GetName(){
        return "CD!";
    }
}

interface IPrintInformation{
    String GetName();

    void Print(String str);

}

interface IDisk{
    String Read();

    void Write(String text);
}

interface IRemovableDisk{

    boolean HasDiskGet();

    void Insert();

    void Reject();
}