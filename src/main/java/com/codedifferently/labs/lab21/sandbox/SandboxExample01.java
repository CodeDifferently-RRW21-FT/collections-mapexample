package com.codedifferently.labs.lab21.sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SandboxExample01 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        int x = 0;
        for(String string:arrayList){
            System.out.println(x + " holds the value of " + string);
            x++;
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for(Map.Entry<String, Integer> pair: map.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        map.put("Powerade", 4);

        for(Map.Entry<String, Integer> pair: map.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
