package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1844. Replace All Digits with Characters
public class ReplaceAllDigitsWithCharactersTest {

    @Test
    public void Case1 () {
        String s = "a1c1e1";
        String output = "abcdef";
        assertEquals(ReplaceAllDigitsWithCharacters.replaceDigits(s), output);
    }

    @Test
    public void Case2 () {
        String s = "a1b2c3d4e";
        String output = "abbdcfdhe";
        assertEquals(ReplaceAllDigitsWithCharacters.replaceDigits(s), output);
    }

}
