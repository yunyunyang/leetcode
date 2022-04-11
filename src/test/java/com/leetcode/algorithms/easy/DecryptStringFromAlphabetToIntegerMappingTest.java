package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1309. Decrypt String from Alphabet to Integer Mapping
public class DecryptStringFromAlphabetToIntegerMappingTest {

    @Test
    public void Case1 () {
        String s = "10#11#12";
        String output = "jkab";
        assertEquals(DecryptStringFromAlphabetToIntegerMapping.freqAlphabets(s), output);
    }

    @Test
    public void Case2 () {
        String s = "1326#";
        String output = "acz";
        assertEquals(DecryptStringFromAlphabetToIntegerMapping.freqAlphabets(s), output);
    }

}
