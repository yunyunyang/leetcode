package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2185. Counting Words With a Given Prefix
public class CountingWordsWithAGivenPrefixTest {

    @Test
    public void Case1 () {
        String[] words = { "pay", "attention", "practice", "attend" };
        String pref = "at";
        int output = 2;
        assertEquals(CountingWordsWithAGivenPrefix.prefixCount(words, pref), output);
    }

    @Test
    public void Case2 () {
        String[] words = { "leetcode", "win", "loops", "success" };
        String pref = "code";
        int output = 0;
        assertEquals(CountingWordsWithAGivenPrefix.prefixCount(words, pref), output);
    }

}
