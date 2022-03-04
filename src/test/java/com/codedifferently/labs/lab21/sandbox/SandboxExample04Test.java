package com.codedifferently.labs.lab21.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SandboxExample04Test {

    @Test
    public void isPalindromeTest01(){
        SandboxExample04 example04 = new SandboxExample04();
        String input = "racecar";
        Boolean actual = example04.isPalindrome(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isPalindromeTest02(){
        SandboxExample04 example04 = new SandboxExample04();
        String input = "stream";
        Boolean actual = example04.isPalindrome(input);
        Assertions.assertFalse(actual);
    }

    @Test
    public void couldBeAPalindromeTest01(){
        SandboxExample04 example04 = new SandboxExample04();
        String input = "aabbccdd";
        Boolean actual = example04.couldBeAPalindrome(input);
        Assertions.assertTrue(actual);
    }

    @Test
    public void couldBeAPalindromeTest02(){
        SandboxExample04 example04 = new SandboxExample04();
        String input = "aabbbcccdd";
        Boolean actual = example04.couldBeAPalindrome(input);
        Assertions.assertFalse(actual);
    }
}
