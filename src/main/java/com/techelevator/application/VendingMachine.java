package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine 
{
    public void run()
    {
        UserOutput userOutput = new UserOutput();
        UserInput userInput = new UserInput();
        ItemManager items = new ItemManager();
        VendingMachineFileInput fileInput = new VendingMachineFileInput();
        //fileInput.read(items);
        PurchaseMenu optionsForPurchasing = new PurchaseMenu();
        MoneyManagement getMoneyFile = new MoneyManagement();

        while(true)
        {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                 items.displayValues();
                // display the vending machine slots
            }
            else if(choice.equals("purchase")) {
                // make a purchase
                optionsForPurchasing.Display();
                //System.out.println("Please insert your money in 1, 5, 10, or 20$ increments");
                //getMoneyFile.getMoney();
                //System.out.println("you have " + getMoneyFile.getMoney() + "$");

            }
            else if(choice.equals("exit"))
            {
                // good bye
                break;
            }
        }
    }
    
}
