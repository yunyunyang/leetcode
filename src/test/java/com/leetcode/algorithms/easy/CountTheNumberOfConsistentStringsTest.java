package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1684. Count the Number of Consistent Strings
public class CountTheNumberOfConsistentStringsTest {

    @Test
    public void Case1 () {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        int output = 2;
        assertEquals(CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words), output);
    }

    @Test
    public void Case2 () {
        String allowed = "abc";
        String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        int output = 7;
        assertEquals(CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words), output);
    }

    @Test
    public void Case3 () {
        String allowed = "cad";
        String[] words = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
        int output = 4;
        assertEquals(CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words), output);
    }
    
}
