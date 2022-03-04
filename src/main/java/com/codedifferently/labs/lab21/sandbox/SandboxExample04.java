package com.codedifferently.labs.lab21.sandbox;

import java.util.HashMap;
import java.util.Map;

public class SandboxExample04 {
    /**
     * Given a word detect if it is spelled the same way forward and backwords
     * example racecar <-> racecar
     * @param word
     * @return
     */
    public Boolean isPalindrome(String word){
        for(int x=0; x <= word.length()/2;x++){
            char beginChar = word.charAt(x);
            char endChar = word.charAt((word.length()-1)-x);
            if(beginChar != endChar)
                return false;
        }
        return true;
    }

    /**
     * Given a set of letters, could this be a palindrome
     * 'aabbccdd' -> yes 'abcddcba'
     * 'aabbbccc' -> no  'abcbccba'
     * @param word
     * @return
     */
    public Boolean couldBeAPalindrome(String word){
        String[] letters = word.split("");
        Map<String, Integer> letterCount = new HashMap<>();
        for (String letter:letters) {
            if(letterCount.containsKey(letter)){
                Integer count = letterCount.get(letter);
                letterCount.put(letter, ++count);
            }else {
                letterCount.put(letter, 1);
            }
        }
        Integer oddCount = 0;
        for(Map.Entry<String, Integer> entry: letterCount.entrySet()){
            if((entry.getValue()%2)!=0)
                oddCount++;
        }
        return (oddCount <= 1);
    }
}
