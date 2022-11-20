package com.techelevator.application;

import com.techelevator.models.Item;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditLog {
    String auditText = "Audit.txt";
    File inputFile = new File(auditText);
    public void writeReciept(String selectedItemKey, Item selectedItem, MoneyManagement userBalance) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E MM/dd/YYYY hh:mm:ss a");



        String currentDateTime = dateTime.format(dateTimeFormat);

        String itemSelected = selectedItem.getItemName();



        BigDecimal userBalanceUpdated = userBalance.getUserBalance();

        BigDecimal startingBalance = userBalanceUpdated.add(new BigDecimal(selectedItem.getPrice()+ "" ));

        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(inputFile, true))) {
            //new FileOutputStream(auditText, true);
            printWriter.append("\n" + currentDateTime + " " + itemSelected + " " + startingBalance + " " + " " + userBalanceUpdated);
           // printWriter.flush();


            printWriter.close();
        } catch (IOException e) {
        }
    }
    public void moneyFed(BigDecimal userBalance){
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E MM/dd/YYYY hh:mm:ss a");

        //String auditText = "Audit.txt";

        String currentDateTime = dateTime.format(dateTimeFormat);

        //File inputFile = new File(auditText);

        try(PrintWriter printWriter = new PrintWriter(new FileOutputStream(inputFile, true))){
            //
            printWriter.append("\n" + currentDateTime + " MONEY FED " + "$" + userBalance + "  $" + userBalance);
            //printWriter.flush();

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void returnChange(String returnChange){
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E MM/dd/YYYY hh:mm:ss a");

        //String auditText = "Audit.txt";

        String currentDateTime = dateTime.format(dateTimeFormat);

        //File inputFile = new File(auditText);

        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(inputFile, true))) {
            //
            printWriter.append("\n" + currentDateTime + returnChange );
            //printWriter.flush();

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}