package com.codedifferently.labs.lab21.problem01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem01Test {

    @Test
    public void removeDuplicatesWithMapTest01(){
        Problem01 problem01 = new Problem01();
        Integer[] mylist = new Integer[]{1,2,3,4,4,4,5,6,1};
        Integer[] expected = new Integer[]{1,2,3,4,5,6};
        Integer[] actual = problem01.removeDuplicatesWithMap(mylist);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesWithSetTest01(){
        Problem01 problem01 = new Problem01();
        Integer[] mylist = new Integer[]{1,2,3,4,4,4,5,6,1};
        Integer[] expected = new Integer[]{1,2,3,4,5,6};
        Integer[] actual = problem01.removeDuplicatesWithSet(mylist);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesAndSortWithSetTest01(){
        Problem01 problem01 = new Problem01();
        Integer[] mylist = new Integer[]{3,4,4,4,5,6,1,1,2};
        Integer[] expected = new Integer[]{1,2,3,4,5,6};
        Integer[] actual = problem01.removeDuplicatesAndSortWithSet(mylist);
        Assertions.assertArrayEquals(expected, actual);
    }
}
