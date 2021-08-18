package com.company;

import java.util.Scanner;

public class Lesson12 {

}

class Book {
    private String Title;
    private String AuthorName;
    private String PublisherName;
    private int YearPublisher;
    private int CountPages;

    {
        YearPublisher = 1111;
        CountPages = 1111;
    }

    public Book(){
        Title = "-";
        AuthorName = "-";
        PublisherName = "-";
    }

    public Book(String title, String Aname, String Pname, int year, int countP){
        Title = title;
        AuthorName = Aname;
        PublisherName = Pname;
        YearPublisher = year;
        CountPages = countP;
    }
}

class Library {
    Scanner scanner = new Scanner(System.in);
    private int PlaceLibrary;

    public Library(int placeLibrary){
        this.PlaceLibrary = placeLibrary;
    }




    public void AddBooks(Book[] book) {
        for (int i = 0; i < book.length - 1; i++) {
            String Title = scanner.next();
            String AuthorName = scanner.next();
            String PublisherName = scanner.next();
            int YearPublisher = scanner.nextInt();
            int CountPages = scanner.nextInt();
            book[i] = new Book(Title, AuthorName, PublisherName, YearPublisher, CountPages);
        }
    }
}