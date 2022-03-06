package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1704. Determine if String Halves Are Alike
public class DetermineIfStringHalvesAreAlikeTest {

    @Test
    public void Case1 () {
        String s = "book";
        boolean output = true;
        assertEquals(DetermineIfStringHalvesAreAlike.halvesAreAlike(s), output);
    }

    @Test
    public void Case2 () {
        String s = "textbook";
        boolean output = false;
        assertEquals(DetermineIfStringHalvesAreAlike.halvesAreAlike(s), output);
    }

}
