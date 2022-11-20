package com.techelevator.models;

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

    public Item(String itemType) {
        this.itemType = itemType;
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

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "Item: " +
                 itemType +
                ": " + location +
                ": " + price +
                ": " + itemName +
                ": " + quantity + " in stock";
    }

//    public String toString(String message){
//        return itemName + " " +message;
//    }

    public String sound (String itemType){
        if (itemType.equalsIgnoreCase("Candy")) {
            System.out.println( "Sugar, Sugar, so Sweet!");
        } else if (itemType.equalsIgnoreCase("munchy")){
            System.out.println( "Munchy, Munchy, so Good!");
        }else if (itemType.equalsIgnoreCase("drink")){
            System.out.println( "Drinky, Drinky, Slurp Slurp!");
        }else if (itemType.equalsIgnoreCase("gum")){
            System.out.println( "Chewy, Chewy, Lots O Bubbles!");
        }else
        System.out.println( "we're not sure what you ordered");
        return "were not sure what happened";
    }
}
