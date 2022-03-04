package com.codedifferently.labs.lab21.wordindex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class WordIndexerTest {

    private String input01 = "Ain't got no tears in my body\n" +
            "I ran out, but boy, I like it, I like it, I like it\n" +
            "Don't matter how, what, where, who tries it\n" +
            "We out here vibin', we vibin', we vibin'";

    @Test
    public void wordsThatStartWithTheLetterTest01(){
        WordIndexer index = new WordIndexer();
        String[] expected = new String[]{"we", "what", "where", "who"};
        ArrayList<String> output = index.wordsThatStartWithTheLetter("w", input01);
        String[] actual = new String[output.size()];
        output.toArray(actual);
        Assertions.assertArrayEquals(expected,actual);
    }
}
