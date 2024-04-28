package org.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private String ownerName;
    private List<Item> items;

    public Library(String name, String address, String ownerName) {
        this.name = name;
        this.address = address;
        this.ownerName = ownerName;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(Item item, int index) {
        items.add(index, item);
    }

    public void updateItem(Item item, int index) {
        if (index <= items.size()) {
            items.set(index, item);
        } else {
            System.out.println("There is no items in this index");
        }
    }

    public void updateItem(Item item1, Item item2) {
        items.set(items.indexOf(item1), item2);
    }

    public void deleteItem(int index) {
        if (index <= items.size()) {
            items.remove(index);
            System.out.println("Removed successfully");
        } else {
            System.out.println("The index you entered isn't exist");
        }
    }

    public void deleteItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Removed successfully");
        } else {
            System.out.println("The index you entered isn't exist");
        }
    }

    public void displayAllItems() {
        for (Item items : this.items) {
            if (items instanceof Book) {
                System.out.println("Book");
                items.displayInformation();
            } else if (items instanceof Magazine) {
                System.out.println("Magazine");
                items.displayInformation();
            } else {
                System.out.println("DVD");
                items.displayInformation();
            }
        }
    }

    public void checkAvailability(Item item) {
        if (items.contains(item)) {
            System.out.println("The item is available");
        } else {
            System.out.println("The item isn't available");
        }
    }
}
