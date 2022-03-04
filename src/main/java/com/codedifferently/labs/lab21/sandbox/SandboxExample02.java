package com.codedifferently.labs.lab21.sandbox;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SandboxExample02 {

    public String leastNumberOfTimes(String words){
        Map<String, Integer> wordCount = new HashMap();
        String[] wordsArray = words.split(" ");

        for(int x = 0; x < wordsArray.length; x++){
            String currentWord = wordsArray[x];
            if(wordCount.containsKey(currentWord)){
                Integer getCurrentCount = wordCount.get(currentWord);
                wordCount.put(currentWord, ++getCurrentCount);
            } else {
                wordCount.put(currentWord, 1);
            }
        }
        Map<String, Integer> sortedMap = wordCount
                                        .entrySet().stream().sorted(Map.Entry.comparingByValue())
                                        .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
                                        (entry1, entry2) -> entry2, LinkedHashMap::new));
        String firstKey = sortedMap.keySet().stream().findFirst().get();
        return firstKey;
    }

    public String leastNumberOfTimesV2(String words){
        Map<String, Integer> wordCount = new HashMap();
        String[] wordsArray = words.split(" ");

        for(int x = 0; x < wordsArray.length; x++){
            String currentWord = wordsArray[x];
            if(wordCount.containsKey(currentWord)){
                Integer getCurrentCount = wordCount.get(currentWord);
                wordCount.put(currentWord, ++getCurrentCount);
            } else {
                wordCount.put(currentWord, 1);
            }
        }
        String leastWord = "";
        Integer leastCount = 0;
        for (Map.Entry<String, Integer> entry: wordCount.entrySet()) {
            String currentWord = entry.getKey();
            Integer currentCount = entry.getValue();
            if(leastWord.equals("") || !leastWord.equals(currentWord)){
                if (leastCount == 0 || currentCount < leastCount){
                    leastWord = currentWord;
                    leastCount = currentCount;
                }
            }
        }
        return leastWord;
    }
}
