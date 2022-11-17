package com.techelevator.application;

import com.techelevator.models.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemManager {

    Map<String, Item> displayMap = new HashMap<>();
    public void mapMaker(String letterNumber, Item item){
        displayMap.put(letterNumber, item);

    }


}
