package com.codedifferently.labs.lab21.sandbox;

import com.codedifferently.labs.lab21.studentindexexample.Student;

public class SandboxExample05 {

    public static int ofWord(String word){
        int response = 0;
        char[] chars = word.toCharArray();
        for(char c: chars){
            response +=c;
        }
        return response;
    }
    public static void main(String[] args) {
        String word1 = "tom";
        String word2 = "mot";
        int ofWord1= ofWord(word1);
        int ofWord2 = ofWord(word2.toLowerCase());
        System.out.println(ofWord1 + " == " + ofWord2);


    }
}
