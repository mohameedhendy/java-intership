package org.example.library;

import java.lang.*;

public class Book extends Item {

    private String author;

    public Book() {
    }

    public Book(String title, String author, int publication_year) {
        super(title, publication_year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInformation() {
        super.displayCommonInfo();
        System.out.println("Author: " + getAuthor());
    }
}
