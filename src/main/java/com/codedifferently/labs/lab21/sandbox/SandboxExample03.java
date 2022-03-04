package com.codedifferently.labs.lab21.sandbox;

import java.util.HashMap;
import java.util.Map;

public class SandboxExample03 {

    public Map<String, Integer> countOccurrencesOfEachWord(String sentence){
        String[] sentenceArray = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word:sentenceArray){
            if(wordCount.containsKey(word)){
                Integer count = wordCount.get(word);
                wordCount.put(word, ++count);
            }else{
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}
