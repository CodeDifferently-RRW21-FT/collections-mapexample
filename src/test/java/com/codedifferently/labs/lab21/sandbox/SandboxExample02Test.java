package com.codedifferently.labs.lab21.sandbox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SandboxExample02Test {

    @Test
    public void leastNumberOfTimes01(){
        String input = "one two one two three one two";
        SandboxExample02 example02 = new SandboxExample02();
        String expected = "three";
        String actual = example02.leastNumberOfTimes(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void leastNumberOfTimes02(){
        String input = "one two one two three one two";
        SandboxExample02 example02 = new SandboxExample02();
        String expected = "three";
        String actual = example02.leastNumberOfTimesV2(input);
        Assertions.assertEquals(expected, actual);
    }
}
