package com.techelevator.models;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String itemType;
    private String location;
    private double price;
    private String itemName;
    private int quantity = 6;
    //private List<String[]> items = new ArrayList<>();

    public Item(String letterNumber, String itemName, double price, String attribute) {
        this.location = letterNumber;
        this.itemName = itemName;
        this.price = price;
        this.itemType = attribute;

    }

    public String getItemType() {
        return itemType;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item: " +
                 itemType + '\'' +
                ": " + location + '\'' +
                ": " + price +
                ": " + itemName + '\'' +
                ": quantity - " + quantity ;
    }
    public String sound (){
        if (itemType.equalsIgnoreCase("Candy")) {
            return "Sugar, Sugar, so Sweet!";
        } else if (itemType.equalsIgnoreCase("munchy")){
            return "Munchy, Munchy, so Good!";
        }else if (itemType.equalsIgnoreCase("drink")){
            return "Drinky, Drinky, Slurp Slurp!";
        }else if (itemType.equalsIgnoreCase("gum")){
            return "Chewy, Chewy, Lots O Bubbles!";
        }return "we're not sure what you ordered";
    }
}
