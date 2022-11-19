package com.techelevator.application;

import com.techelevator.models.Item;
import com.techelevator.ui.UserInput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItemManager {
    UserInput userInput = new UserInput();
    //Item item = new Item();
    private Map<String, Item> displayMap = new HashMap<>();

    public void mapMaker(String letterNumber, Item item){

        displayMap.put(letterNumber, item);

    }


    public Map<String, Item> getDisplayMap() {
         //this.displayMap = displayMap;
         return this.displayMap;
    }

        // make a method to use inside setDisplayMap, and update the map using user input
        // userInput.getForUserInput();
        // set quantity of new item
 //      public void setDisplayMap(Map<String, Item> displayMap) {
 //         for (String mapKey : userInput.getForUserInput())
            // item differentItem =   displayMap.get(mapKey);
//            //int quantity = displayMap.get(mapKey.ge) ;
//
//            //displayMap.put();
//
//        this.displayMap = displayMap;
//    }

    public void displayValues(Map<String, Item> displayMap){

        for (Map.Entry<String, Item> mp : displayMap.entrySet()){

            Item currentItem = mp.getValue();
            System.out.println(mp.getKey() + " " + currentItem.toString() );
        }


    }
    //System.out.println(currentItem.toString("this is the current message"));
    //String str = displayMap.toString();
    //System.out.println(str);
    //Iterator<Map.Entry<String,Item>> itr = displayMap.entrySet().iterator();
    //while (itr.hasNext()){
    //System.out.println(itr.next());
    //System.out.println(displayMap.get("A1"));
    //String values = String.valueOf(displayMap.values());
    //System.out.println(values);
    //String mpValue = mp.toString();
}
