package com.techelevator.ui;

import com.techelevator.application.MoneyManagement;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * <p>
 * Dependencies: None
 */
public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("D")) {
            return "display";
        } else if (option.equals("P")) {
            return "purchase";
        } else if (option.equals("E")) {
            return "exit";
        } else {
            return "";
        }

    }


    public String getPurchaseScreenOption() {

        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("A) Add money to machine");
        System.out.println("P) Make a purchase");
        System.out.println("F) Finalize transaction");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("A")) {
            return "Add money";
        } else if (option.equals("P")) {
            return "purchase";
        } else if (option.equals("F")) {
            return "Finalize";
        } else {
            return "Were not sure what happened";
        }

    }
}
