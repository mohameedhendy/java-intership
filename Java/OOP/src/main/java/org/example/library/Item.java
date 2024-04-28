package org.example.library;

import java.lang.*;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Item {
    private String title;
    private int publication_year;
    ArrayList<Item> items = new ArrayList<>();

    public Item() {
    }

    public Item(String title, int publication_year) {
        this.title = title;
        this.publication_year = publication_year;
    }

    public abstract void displayInformation();

    public void displayCommonInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publication Year: " + getPublication_year());
    }

    public void checkAvailability(Item item) {
        if (items.contains(item)) {
            System.out.println("The item is available");
        } else {
            System.out.println("The item isn't available");
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }
}
