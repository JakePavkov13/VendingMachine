package com.techelevator.models;

public class Item {
    private String itemType;
    private String location;
    private double price;
    private String itemName;
    private int quantity = 6;

    public Item(String letterNumber, String itemName, double price, String attribute) {
        this.location = letterNumber;
        this.itemName = itemName;
        this.price = price;
        this.itemType = attribute;

    }
}
