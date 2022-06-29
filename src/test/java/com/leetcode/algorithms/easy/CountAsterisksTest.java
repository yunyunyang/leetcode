package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2315. Count Asterisks
public class CountAsterisksTest {

    @Test
    public void Case1 () {
        String s = "l|*e*et|c**o|*de|";
        int output = 2;
        assertEquals(CountAsterisks.countAsterisks(s), output);
    }

    @Test
    public void Case2 () {
        String s = "iamprogrammer";
        int output = 0;
        assertEquals(CountAsterisks.countAsterisks(s), output);
    }

    @Test
    public void Case3 () {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        int output = 5;
        assertEquals(CountAsterisks.countAsterisks(s), output);
    }

    @Test
    public void Case4 () {
        String s = "*jsaxclgfcyjds";
        int output = 1;
        assertEquals(CountAsterisks.countAsterisks(s), output);
    }

}
