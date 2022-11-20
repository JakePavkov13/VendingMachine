package com.techelevator.application;

import com.techelevator.models.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditLog {
    public void writeReciept(String selectedItemKey, Item selectedItem, MoneyManagement userBalance) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E MM/dd/YYYY hh:mm:ss a");

        String auditText = "Audit.txt";

        String currentDateTime = dateTime.format(dateTimeFormat);

        String itemSelected = selectedItem.getItemName();

        File inputFile = new File(auditText);

        BigDecimal userBalanceUpdated = userBalance.getUserBalance();

        BigDecimal startingBalance = userBalanceUpdated.add(new BigDecimal(selectedItem.getPrice()+ "" ));

        try (PrintWriter printWriter = new PrintWriter(auditText)) {
            printWriter.println(currentDateTime + " " + itemSelected + " " + startingBalance + " " + " " + userBalanceUpdated);
            printWriter.println();
        } catch (IOException e) {
        }
    }
    public void moneyFed(BigDecimal userBalance){
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E MM/dd/YYYY hh:mm:ss a");

        String auditText = "Audit.txt";

        String currentDateTime = dateTime.format(dateTimeFormat);

        File inputFile = new File(auditText);

        try(PrintWriter printWriter = new PrintWriter(auditText)){
            printWriter.println(currentDateTime + " MONEY FED " + "$" + userBalance + "  $" + userBalance);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void returnChange(int dollarCounter, int quarterCounter, int dimeCounter, int nickleCounter, BigDecimal userBalance){
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E MM/dd/YYYY hh:mm:ss a");

        String auditText = "Audit.txt";

        String currentDateTime = dateTime.format(dateTimeFormat);

        File inputFile = new File(auditText);

        try (PrintWriter printWriter = new PrintWriter(auditText)){
            printWriter.println(currentDateTime + " CHANGE GIVEN: " + dollarCounter + " Dollar(s), " + quarterCounter + " Quarter(s), " + dimeCounter + " Dime(s), " + nickleCounter + " Nickle(s)" + " $" + userBalance );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}