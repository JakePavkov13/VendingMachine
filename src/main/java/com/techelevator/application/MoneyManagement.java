package com.techelevator.application;

import com.techelevator.models.Item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MoneyManagement {

    private BigDecimal userBalance;

    public BigDecimal getMoney(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please insert your money in whole dollar amounts");
        String userStringMoney = userInput.nextLine();
        //Double.parseDouble(userStringMoney);
        BigDecimal hopeThisWorksBigDecimal = new BigDecimal(userStringMoney).setScale(2, RoundingMode.HALF_UP);
        //System.out.println("you have " + hopeThisWorksBigDecimal + "$");
        this.userBalance = hopeThisWorksBigDecimal;
        return hopeThisWorksBigDecimal;
    }

    public BigDecimal deduction(Item itemToPurchase){
        BigDecimal itemCost = new BigDecimal(String.valueOf(itemToPurchase.getPrice()));
        this.userBalance = userBalance.subtract(itemCost);

        return this.userBalance;
    }

    public BigDecimal getUserBalance() {

        return userBalance;
    }
}
