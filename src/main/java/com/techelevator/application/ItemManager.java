package com.techelevator.application;

import com.techelevator.models.Item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItemManager {

    Map<String, Item> displayMap = new HashMap<>();

    public void mapMaker(String letterNumber, Item item){

        displayMap.put(letterNumber, item);

    }


    public void getDisplayMap() {
         this.displayMap = displayMap;
    }


    public void setDisplayMap(Map<String, Item> displayMap) {
        this.displayMap = displayMap;
    }

    public void displayValues(){
        //System.out.println(displayMap.get("A1"));
        //String values = String.valueOf(displayMap.values());
        //System.out.println(values);
        for (Map.Entry<String, Item> mp : displayMap.entrySet()){
            //String mpValue = mp.toString();
            System.out.println(mp.getKey() + " " + mp.getValue().toString() );

            //String str = displayMap.toString();
            //System.out.println(str);

            //Iterator<Map.Entry<String,Item>> itr = displayMap.entrySet().iterator();
        //while (itr.hasNext()){
        //    System.out.println(itr.next());

        }
    }
}
