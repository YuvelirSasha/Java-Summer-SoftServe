package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.locks.Condition;

public class Lesson15 {
    public static void main(String[] args) {

        Director director = new Director("STAS", "FAMILIAsh", 1697);
        Move a = new Move("f", "o", director, "Ukraine", "lol", 2004, 5.3);
        Move e = new Move("z", "B", director, "Ukraine", "dsadsa",2008, 5.2);
        Move b = new Move("anteresting", "......", director, "Ukraine", "lol",2001, 5.1);
        Move o = new Move("k", "odsadksa", director, "Ukrainedsadsa", "lol",2003, 5.3);
        Cinema d = new Cinema();
        d.Create(a);
        d.Create(e);
        d.Create(b);
        d.Create(o);

        d.SortByRating();
        d.GetMoves();
    }
}

class Cinema  implements CRUD{
    ArrayList<Move> moves = new ArrayList<>();

    public void GetMoves(){
        for (Move m: moves) {
            System.out.println(m.GetMove());
        }
    }

    @Override
    public void Create(Move m) {
        moves.add(m);
    }

    @Override
    public void Read(int number) {
        Move move = moves.get(number);
        System.out.println(move.GetMove());
    }

    @Override
    public void Update(Move m, int number) {
        moves.set(number, m);
    }

    @Override
    public void Remove(Move m) {
        moves.remove(m);
    }

    public void FindTitleM(String title){
        for (int i = 0; i < moves.size(); i++) {
            if(moves.get(i).GetTitle().equals(title))
                System.out.println(moves.get(i).GetMove());
        }
    }

    public void FindGenreM(String genre){
        for (int i = 0; i < moves.size(); i++) {
            if(moves.get(i).GetGenre().equals(genre))
                System.out.println(moves.get(i).GetMove());
        }
    }

    public void SortByTitle(){
        Collections.sort(moves, new Comparator<Move>() {
            @Override
            public int compare(Move o1, Move o2) {
                return o1.GetTitle().compareTo(o2.GetTitle());
            }
        });
    }

    public void SortByYear(){
        Collections.sort(moves, new Comparator<Move>() {
            @Override
            public int compare(Move o1, Move o2) {
                return Integer.toString(o1.GetYear()).compareTo(Integer.toString(o2.GetYear()));
            }
        });
    }

    public void SortByRating(){
        Collections.sort(moves, new Comparator<Move>() {
            @Override
            public int compare(Move o1, Move o2) {
                return Double.toString(o1.GetRating()).compareTo(Double.toString(o2.GetRating()));
            }
        });
    }
}

class Move{
    private String title;
    private String description;
    private Director director;
    private String country;
    private String genre;
    private int year;
    private double rating;



    Move(String title, String description, Director director, String country, String genre, int year, double rating){
        this.title = title;
        this.description = description;
        this.director = director;
        this.country = country;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String GetMove(){
        return title + " " + description + " " + director.GetDirector() + " " + country + " " + year + " " + rating;
    }

    public String GetTitle(){
        return this.title;

    }

    public String GetGenre(){
        return this.genre;
    }

    public int GetYear(){
        return this.year;
    }

    public double GetRating() {
        return rating;
    }
}

class Director{
    private String name;
    private String surName;
    private int yearBirth;

    Director(String name, String surName, int yearBirth){
        this.name = name;
        this.surName = surName;
        this.yearBirth = yearBirth;
    }

    public String GetDirector(){
        return name + " " + surName + " " + yearBirth;
    }
}

interface CRUD{
    void Create(Move m);

    void Read(int number);

    void Update(Move m, int number);

    void Remove(Move m);
}
