package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1662. Check If Two String Arrays are Equivalent
public class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    public void Case1 () {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        boolean output = true;
        assertEquals(CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2), output);
    }

    @Test
    public void Case2 () {
        String[] word1 = { "a", "cb" };
        String[] word2 = { "ab", "c" };
        boolean output = false;
        assertEquals(CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2), output);
    }

    @Test
    public void Case3 () {
        String[] word1 = { "abc", "d", "defg" };
        String[] word2 = { "abcddefg" };
        boolean output = true;
        assertEquals(CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2), output);
    }

}
