package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1221. Split a String in Balanced Strings
public class SplitAStringInBalancedStringsTest {

    @Test
    public void Case1 () {
        String s = "RLRRLLRLRL";
        int output = 4;
        assertEquals(SplitAStringInBalancedStrings.balancedStringSplit(s), output);
    }

    @Test
    public void Case2 () {
        String s = "RLLLLRRRLR";
        int output = 3;
        assertEquals(SplitAStringInBalancedStrings.balancedStringSplit(s), output);
    }

    @Test
    public void Case3 () {
        String s = "LLLLRRRR";
        int output = 1;
        assertEquals(SplitAStringInBalancedStrings.balancedStringSplit(s), output);
    }

}
