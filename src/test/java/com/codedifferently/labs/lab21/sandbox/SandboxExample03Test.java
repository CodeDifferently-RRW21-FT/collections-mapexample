package com.codedifferently.labs.lab21.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class SandboxExample03Test {

    @Test
    public void countOccurrencesOfEachWordTest01(){
        SandboxExample03 sandboxExample03 = new SandboxExample03();
        String inputSentence = "WuTang Clan is For the Kids. We Love WuTang";
        Integer expectedCountOfWuTang = 2;
        Map<String, Integer> wordCount = sandboxExample03.countOccurrencesOfEachWord(inputSentence);
        Integer actualCountOfWuTang = wordCount.get("WuTang");
        Assertions.assertEquals(expectedCountOfWuTang, actualCountOfWuTang);
    }
}
