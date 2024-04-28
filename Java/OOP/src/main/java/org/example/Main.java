package org.example;

import org.example.library.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Algorithm", "mohamed", 1986);
        Book book2 = new Book("Data Structure", "ali", 1991);
        Book book3 = new Book("OOP", "ahmed", 1976);
        Magazine magazine1 = new Magazine("magazine1", "waleed", 2010);
        DVD dvd1 = new DVD("Java", "hassan", 2000);

        Library library1 = new Library("library1", "zefta", "mohamed");

        library1.addItem(book1);
        library1.addItem(book2);
        library1.checkAvailability(book1);
        library1.deleteItem(book1);
        library1.checkAvailability(book1);
        library1.addItem(magazine1);
        library1.addItem(dvd1);
        library1.displayAllItems();

        library1.updateItem(book2, book3);
        library1.displayAllItems();


    }
}