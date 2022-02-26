package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 709. To Lower Case
public class ToLowerCaseTest {

    @Test
    public void Case1 () {
        String s = "Hello";
        String output = "hello";
        assertEquals(ToLowerCase.toLowerCase(s), output);
    }

    @Test
    public void Case2 () {
        String s = "here";
        String output = "here";
        assertEquals(ToLowerCase.toLowerCase(s), output);
    }

    @Test
    public void Case3 () {
        String s = "LOVELY";
        String output = "lovely";
        assertEquals(ToLowerCase.toLowerCase(s), output);
    }

}
