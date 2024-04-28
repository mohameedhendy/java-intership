package org.example.library;

import java.lang.*;

public class Magazine extends Item {

    private String publisher;

    public Magazine() {
    }

    public Magazine(String title, String publisher, int publication_year) {
        super(title, publication_year);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void displayInformation() {
        super.displayCommonInfo();
        System.out.println("Publisher: " + getPublisher());
    }
}
