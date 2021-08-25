package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Lesson13 {
    public static void main(String[] args) {
        //task 1
        //Passport test0 = new Passport("Bakyn", "Kiril", "Alex", 'F', 46879, 4523);
        //test0.ShowInformation();
        //ForeignPassport test1 = new ForeignPassport("Sasha", "Alex", "Yziovich", 'M', 454135, 46643, 462314, "Ukrain - Polend");
        //test1.ShowInformation();
        //test1.AddVisa("Urugvai - Ukrain");
        //test1.ShowInformation();

        //task2
        //Animal one = new Animal("people", 5, 6, 2);
        //one.Move();
        //one.Sound();
        //one.Show();
        //Animal dog = new Dog("buldog", 55, 69, 4, 2);
        //dog.Sound();
        //dog.Move();
        //dog.Show();
        //Animal duck = new Duck("kara", 69, 47, 2, "dovgiy", 666);
        //duck.Move();
        //duck.Sound();
        //duck.Show();
        //Animal parrot = new Parrot("pipi", 64, 23, 2, true, 2, 3);
        //parrot.Move();
        //parrot.Sound();
        //parrot.Show();
        //Animal frog = new Frog("figi-figi", 11, 23, 4, "loret", 2);
        //frog.Move();
        //frog.Sound();
        //frog.Show();

        //task 3
        RollingAnimal();
    }

    public static void RollingAnimal(){
        Animal one = new Animal("people", 5, 6, 2);
        Animal dog = new Dog("buldog", 55, 69, 4, 2);
        Animal duck = new Duck("kara", 69, 47, 2, "dovgiy", 666);
        Animal parrot = new Parrot("pipi", 64, 23, 2, true, 2, 3);
        Animal frog = new Frog("figi-figi", 11, 23, 4, "loret", 2);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(one);
        animals.add(dog);
        animals.add(duck);
        animals.add(parrot);
        animals.add(frog);

        Random rnd = new Random();
        int random = rnd.nextInt(5);
        animals.get(random).Show();
        animals.get(random).Sound();

    }
}

class Passport {
    protected String Surname;
    protected String Name;
    protected String Patronymic;
    protected char Sex;
    protected int DocumentNo;
    protected int Authority;

    Passport(String Surname, String Name, String Patronymic, char Sex, int DocumentNo, int Authority){
        this.Surname = Surname;
        this.Name = Name;
        this.Patronymic = Patronymic;
        this.Sex = Sex;
        if (DocumentNo < 999999999 && DocumentNo > 0)
            this.DocumentNo = DocumentNo;
        if (Authority < 9999 && Authority > 0)
            this.Authority = Authority;
    }

    public void ShowInformation() {
        System.out.printf("Surname: %s\n", Surname);
        System.out.printf("Name: %s\n", Name);
        System.out.printf("Patronymic: %s\n", Patronymic);
        System.out.printf("Sex: %C\n", Sex);
        System.out.printf("Document number: %d\n", DocumentNo);
        System.out.printf("Authority: %d\n", Authority);
        System.out.println();
    }
}

class ForeignPassport extends Passport{
    private int PersonalNo;
    private ArrayList<String> visas = new ArrayList<>();


    ForeignPassport(String Surname, String Name, String Patronymic, char Sex, int DocumentNo, int Authority, int PersonalNo, String visas ){
        super(Surname, Name, Patronymic, Sex, DocumentNo, Authority);
        if (PersonalNo < 999999999 && PersonalNo > 0)
            this.PersonalNo = PersonalNo;
        this.visas.add(visas);
    }

    public void AddVisa(String name) {
        visas.add(name);
    }

    public void ShowInformation() {
        super.ShowInformation();
        System.out.printf("Personal number: %d\n", PersonalNo);
        System.out.println("---Visas---");
        for (String s: visas) {
            System.out.println(s);
        }
        System.out.println();
    }
}

class Animal{
    protected String name;
    protected float height;
    protected float width;
    protected int limbs;


    Animal(String n, float h, float w, int l){
        name = n;
        height = h;
        width = w;
        limbs = l;
    }

    public void Sound(){
        System.out.println(".....");
    }

    public void Move(){
        System.out.println("no movement");
    }

    public void Show(){
        System.out.printf("Animal name: %s\n", name);
        System.out.printf("Animal height: %f\n", height);
        System.out.printf("Animal width: %f\n", width);
        System.out.println();
    }
}

class Dog extends Animal{
    private int smell;
    private boolean devotion = true;

    Dog(String n, float h, float w, int l, int s){
        super(n, h, w, l);
        smell = s;
    }

    @Override
    public void Sound(){
        System.out.println("Bark!");
    }

    @Override
    public void Move(){
        System.out.println("For 4 paws");
    }

    public void Show(){
        super.Show();
        System.out.printf("He has %d smell\n", smell);
        if(devotion)
        System.out.println("Devotion TRUE");
        System.out.println();
    }
}

class Duck extends Animal{
    private String TypeBeak;
    private int CountFeathers;


    Duck(String n, float h, float w, int l, String b, int CountF){
        super(n, h, w, l);
        TypeBeak = b;
        CountFeathers = CountF;
    }

    @Override
    public void Sound(){
        System.out.println("Quack!");
    }

    @Override
    public void Move(){
        System.out.println("For 2 paws or fly or swim");
    }

    public void Show(){
        super.Show();
        System.out.printf("Duck have beak type: %s\n", TypeBeak);
        System.out.printf("Duck have %d feathers\n", CountFeathers);
        System.out.println();
    }
}

class Parrot extends Animal{
    private boolean SkillSpeak = true;
    private int nostrils;
    private int fingers;

    Parrot(String n, float h, float w, int l, boolean ss, int nostrils, int fingers){
        super(n, h, w, l);
        SkillSpeak = ss;
        this.nostrils = nostrils;
        this.fingers = fingers;
    }

    @Override
    public void Sound(){
        System.out.println("Speak human voice!");
    }

    @Override
    public void Move(){
        System.out.println("For 2 paws or fly");
    }

    public void Show() {
        super.Show();
        if (SkillSpeak)
            System.out.println("Parrot has skill speak");
        else
            System.out.println("This Parrot not have skill speak");
        System.out.printf("Parrot have %s nostrils\n", nostrils);
        System.out.printf("Parrot have %d fingers\n", fingers);
        System.out.println();
    }
}

class Frog extends Animal{
    private String TypeEardrum;
    private int CountSwimmingMembrane;

    Frog(String n, float h, float w, int l, String TypeEardrum, int CountSwimmingMembrane){
        super(n, h, w, l);
        this.TypeEardrum = TypeEardrum;
        this.CountSwimmingMembrane = CountSwimmingMembrane;
    }

    @Override
    public void Sound(){
        System.out.println("Kwaak!");
    }

    @Override
    public void Move(){
        System.out.println("For 4 paws");
    }

    public void Show(){
        super.Show();
        System.out.printf("Frog has type eardrum %s\n", TypeEardrum);
        System.out.printf("Frog have swimming membrane %d\n", CountSwimmingMembrane);
        System.out.println();
    }


}