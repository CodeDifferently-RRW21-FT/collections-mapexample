package com.codedifferently.labs.lab21.problem01;

import java.util.*;

public class Problem01 {

    public Integer[] removeDuplicatesWithMap(Integer[] integers){
        Map<Integer,Integer> counter = new HashMap<>();
        for(int x = 0; x < integers.length; x++){
            Integer key = integers[x];
            if(!counter.containsKey(key)){
                counter.put(key, 1);
            }
        }
        Set<Integer> uniqueKeys = counter.keySet();
        Integer[] response = new Integer[uniqueKeys.size()];
        uniqueKeys.toArray(response);
        return response;
    }

    public ArrayList<Integer> removeDuplicatesAndSortWithMap(ArrayList<Integer> integers){
        return null;
    }

    public Integer[] removeDuplicatesWithSet(Integer[] integers){
        Set<Integer> counter = new HashSet<>();
        for(int x = 0; x < integers.length; x++){
            Integer key = integers[x];
             counter.add(key);
        }
        Integer[] response = new Integer[counter.size()];
        counter.toArray(response);
        return response;
    }

    public Integer[] removeDuplicatesAndSortWithSet(Integer[] integers){
        Set<Integer> counter = new TreeSet<>();
        for(int x = 0; x < integers.length; x++){
            Integer key = integers[x];
            counter.add(key);
        }
        Integer[] response = new Integer[counter.size()];
        counter.toArray(response);
        return response;
    }

}
