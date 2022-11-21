package com.techelevator.application;


import com.techelevator.models.Item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MoneyManagement {
    AuditLog auditLog = new AuditLog();
    private BigDecimal userBalance;

    public MoneyManagement() {

        this.userBalance = BigDecimal.ZERO;
    }

    public BigDecimal getMoney(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please insert your money in whole dollar amounts");
        String userStringMoney = userInput.nextLine();
        //Double.parseDouble(userStringMoney);
        BigDecimal hopeThisWorksBigDecimal = new BigDecimal(userStringMoney).setScale(2, RoundingMode.HALF_UP);
        //System.out.println("you have " + hopeThisWorksBigDecimal + "$");
        this.userBalance = hopeThisWorksBigDecimal;
        auditLog.moneyFed(userBalance);
        return hopeThisWorksBigDecimal;
    }

    public boolean deduction(Item itemToPurchase, int saleCounter) {

        BigDecimal itemCost = new BigDecimal(String.valueOf(itemToPurchase.getPrice()));
        if (userBalance.compareTo(itemCost) == 1 || userBalance.compareTo(itemCost) == 0) {

            if (saleCounter % 2 == 0){
                itemCost = itemCost.subtract(BigDecimal.ONE);
            }
            this.userBalance = userBalance.subtract(itemCost);

            return true;
        }return false ;
    }
    public BigDecimal getUserBalance() {

        return userBalance;
    }
    public void returnChange(){
        BigDecimal nickle = new BigDecimal("0.05");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal quarter = new BigDecimal("0.25");
        BigDecimal dollar = new BigDecimal("1.00");
        int nickleCounter = 0;
        int dimeCounter = 0;
        int quarterCounter = 0;
        int dollarCounter = 0;

        //double userBalanceDouble = userBalance.doubleValue(userBalance);

            // 6.15
            while( userBalance.compareTo(dollar) == 1 || userBalance.compareTo(dollar) == 0) {
             dollarCounter += 1;
             userBalance = userBalance.subtract(dollar);
         }
            while( userBalance.compareTo(quarter) == 1 || userBalance.compareTo(quarter) == 0) {
            quarterCounter += 1;
            userBalance = userBalance.subtract(dollar);
            }
        while( userBalance.compareTo(dime) == 1 || userBalance.compareTo(dime) == 0) {
            dimeCounter += 1;
            userBalance = userBalance.subtract(dime);
        }
        while( userBalance.compareTo(nickle) == 1 || userBalance.compareTo(nickle) == 0) {
            nickleCounter += 1;
            userBalance = userBalance.subtract(nickle);
        }
        String returnChange = "Your change is " + dollarCounter + "dollars " + quarterCounter + "quarters " + dimeCounter + "dimes " + nickleCounter + "nickles";
        System.out.println(returnChange);
        auditLog.returnChange(returnChange);
        this.userBalance = BigDecimal.ZERO;


    }
}
