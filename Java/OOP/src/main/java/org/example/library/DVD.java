package org.example.library;

import java.lang.*;

public class DVD extends Item {

    private String director;

    public DVD() {
    }

    public DVD(String title, String director, int Publication_year) {
        super(title, Publication_year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void displayInformation() {
        super.displayCommonInfo();
        System.out.println("Director: " + getDirector());
    }
}
