package com.techelevator.application;

import com.techelevator.models.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachineFileInput {

        public void read(ItemManager items){

            File catering = new File("catering.csv");

            try {
                Scanner newScanner = new Scanner(catering);
                while (newScanner.hasNextLine() ){

                    String lineText = newScanner.nextLine();

                    String [] lineTextArray = lineText.split(",");

                    String letterNumber = lineTextArray[0];

                    String itemName = lineTextArray[1];

                    double price = Double.parseDouble(lineTextArray[2]);

                    String attribute = lineTextArray[3];

                Item eachItem  = new Item(letterNumber, itemName, price, attribute);

                items.mapMaker(letterNumber, eachItem);

                }



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }



}
