package com.techelevator.application;

import com.techelevator.ui.UserInput;

public class PurchaseMenu {
    UserInput purchaseDisplayOptions = new UserInput();
    MoneyManagement moneyManagementForPurchaseMenu = new MoneyManagement();
    public void Display(){
        String choice = purchaseDisplayOptions.getPurchaseScreenOption();
        if(choice.equalsIgnoreCase("Add money to machine")){
            moneyManagementForPurchaseMenu.getMoney();
        }else if (choice.equalsIgnoreCase("Make a purchase")){
           // moneyManagementForPurchaseMenu.deduction();
        }else if (choice.equalsIgnoreCase("Finalize transaction")){
            System.out.println("Your remaining balance is " + moneyManagementForPurchaseMenu.getUserBalance());
        }
    }
    public void addingMoney(){
        //if(choice.equals("display"))

    }



}
