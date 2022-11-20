package com.techelevator.application;

import com.techelevator.models.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.util.Map;

public class PurchaseMenu {
    UserOutput messagesToUser = new UserOutput();
    UserInput purchaseDisplayOptions = new UserInput();
    MoneyManagement moneyManagementForPurchaseMenu = new MoneyManagement();
    ItemManager items = new ItemManager();
    AuditLog audit = new AuditLog();


    public void purchase(Map<String, Item> inventoryMap, String selectedItemKey){

        Item selectedItem = inventoryMap.get(selectedItemKey);
        int ourQuantity = selectedItem.getQuantity();
        if (ourQuantity > 0) {
           if (moneyManagementForPurchaseMenu.deduction(selectedItem)) {
               selectedItem.setQuantity(ourQuantity - 1);
               items.mapMaker(selectedItemKey, selectedItem);
               audit.writeReciept(selectedItemKey, selectedItem, moneyManagementForPurchaseMenu);
           }else {
               System.out.println("Not enough money");
           }
        }else{
            System.out.println("Not enough stock");
        }

    }
    public void Display(Map<String, Item> inventoryMap){
        String choice = purchaseDisplayOptions.getPurchaseScreenOption();

        if(choice.equalsIgnoreCase("Add money")){
            moneyManagementForPurchaseMenu.getMoney();
            messagesToUser.displayMessage("You have " + moneyManagementForPurchaseMenu.getUserBalance());
            Display(inventoryMap);

        }else if (choice.equalsIgnoreCase("purchase")){
            items.displayValues(inventoryMap);
            messagesToUser.displayMessage("Please enter the letter number combination of what you wish to buy");

            purchaseDisplayOptions.userInput();
            String selectedItemKey = purchaseDisplayOptions.getForUserInput();
            purchase(inventoryMap, selectedItemKey);
            System.out.println(" you have " + moneyManagementForPurchaseMenu.getUserBalance() + " left");
            Display(inventoryMap);


        }else if (choice.equalsIgnoreCase("Finalize")){
            moneyManagementForPurchaseMenu.returnChange();
            System.out.println("Your remaining balance is " + moneyManagementForPurchaseMenu.getUserBalance());
        }
    }
    //public void addingMoney(){
        //if(choice.equals("display"))

   // }



}
