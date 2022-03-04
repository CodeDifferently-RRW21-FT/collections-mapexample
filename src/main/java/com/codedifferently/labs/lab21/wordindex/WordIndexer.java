package com.codedifferently.labs.lab21.wordindex;

import java.util.*;

public class WordIndexer {

    /**
     * Return all the words in our index that start with the letter 'letter'
     * @param letter
     * @return
     */
    public Set<String> wordsThatStartWithTheLetter(String letter, String input){
        input = input.toLowerCase()
                .replace("\n", " ")
                .replace(",", "")
                .replace("'", "");
        System.out.println(input);
        String[] words = input.split(" ");
        Map<Character, Set<String>> wordIndex = new TreeMap<>();
        for(String word : words){
            char firstLetter = word.charAt(0);
            if(wordIndex.containsKey(firstLetter)){
                Set<String> index = wordIndex.get(firstLetter);
                index.add(word);
            }else {
                Set<String> index = new TreeSet<>();
                index.add(word);
                wordIndex.put(firstLetter,index);
            }
        }
        return wordIndex.get(letter.charAt(0));
    }
}
