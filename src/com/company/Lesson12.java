package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {

        Library test2 = new Library();
        test2.AddBook();
        test2.AddBook();
        test2.AddBook();
        test2.SortByTitle();

    }
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

    public void GetBook(){
        System.out.println("------Book------");
        System.out.printf("Title Book: %s\n", this.Title);
        System.out.printf("Author Name: %s\n", this.AuthorName);
        System.out.printf("Publisher Name: %s\n", this.PublisherName);
        System.out.printf("Publisher Year: %d\n", this.YearPublisher);
        System.out.printf("Count pages in book: %d\n", this.CountPages);
        System.out.println("----------------");
    }

    public String GetAuthorName(){
        return this.AuthorName;
    }

    public String GetTitle(){
        return this.Title;
    }

    public int GetYear(){
        return this.YearPublisher;
    }
}

class Library {
    Scanner scanner = new Scanner(System.in);
    private int CountBook;
    private Book[] books = new Book[CountBook];

    {
        CountBook = 0;
    }

    public void AddBook() {
        Book[] test1 = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            test1[i] = books[i];
        }
        System.out.println("Enter Title your book:");
        String Title = scanner.next();
        System.out.println("Enter Name Author your book:");
        String Aname = scanner.next();
        System.out.println("Enter Publisher Name your book:");
        String Pname = scanner.next();
        System.out.println("Enter year publisher your book:");
        int Year = scanner.nextInt();
        System.out.println("Enter Count Pages in your book:");
        int CountP = scanner.nextInt();

        test1[test1.length - 1] = new Book(Title, Aname, Pname, Year, CountP);
        ++CountBook;
        books = new Book[CountBook];
        for (int i = 0; i < test1.length; i++) {
            books[i] = test1[i];
        }

    }

    public void PrintBooks(){
        for (int i = 0; i < books.length; i++) {
            books[i].GetBook();
        }
    }

    public void FindAuthorName(String name){
        int helpcount = 0;
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].GetAuthorName())){
                books[i].GetBook();
                ++helpcount;
                break;
            }
        }
        if (helpcount == 0)
            System.out.println("Sorry but your author not find");
    }

    public void FindTitle(String name){
        int helpcount = 0;
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].GetTitle())){
                books[i].GetBook();
                ++helpcount;
                break;
            }
        }
        if (helpcount == 0)
            System.out.println("Sorry but your book not find");
    }

    public void FindYear(int number){
        int helpcount = 0;
        for (int i = 0; i < books.length; i++) {
            if (number == books[i].GetYear()){
                books[i].GetBook();
                ++helpcount;
                break;
            }
        }
        if (helpcount == 0)
            System.out.println("Sorry but your book not find");
    }

    public void SortByPublicationYear(){
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j].GetYear() > books[j + 1].GetYear()){
                    Book[] temp = new Book[1];
                    temp[0] = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp[0];
                }
            }
        }
    }

    public void SortByTitle(){
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                String firstb = books[j].GetTitle();
                String nextb = books[j + 1].GetTitle();
                if (firstb.compareTo(nextb) > 0){
                    Book[] temp = new Book[1];
                    temp[0] = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp[0];
                }
            }
        }
    }
}