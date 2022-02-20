package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1528. Shuffle String
public class ShuffleStringTest {

    @Test
    public void Case1 () {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String output = "leetcode";
        assertEquals(ShuffleString.restoreString(s, indices), output);
    }

    @Test
    public void Case2 () {
        String s = "abc";
        int[] indices = { 0,1,2 };
        String output = "abc";
        assertEquals(ShuffleString.restoreString(s, indices), output);
    }

}
