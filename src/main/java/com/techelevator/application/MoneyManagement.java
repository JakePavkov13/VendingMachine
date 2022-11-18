package com.techelevator.application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MoneyManagement {

    private BigDecimal userBalance;

    public void getMoney(){
        Scanner userInput = new Scanner(System.in);
        String userStringMoney = userInput.nextLine();
        //Double.parseDouble(userStringMoney);
        BigDecimal hopeThisWorksBigDecimal = new BigDecimal(userStringMoney).setScale(2, RoundingMode.HALF_UP);

    }


}
