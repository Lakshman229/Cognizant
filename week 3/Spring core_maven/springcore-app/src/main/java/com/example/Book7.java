package com.example;

public class Book7 {
    private String title;
    private Author7 author;

    // Constructor injection
    public Book7(String title) {
        this.title = title;
    }

    // Setter injection
    public void setAuthor(Author7 author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author.getName());
    }
}
