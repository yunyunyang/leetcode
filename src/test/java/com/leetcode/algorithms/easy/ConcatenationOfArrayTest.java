package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 1929. Concatenation of Array
public class ConcatenationOfArrayTest {

    @Test
    public void Case1 () {
        int[] nums = { 1, 2, 1 };
        int[] output = { 1, 2, 1, 1, 2, 1 };
        assertArrayEquals(ConcatenationOfArray.getConcatenation(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 3, 2, 1 };
        int[] output = { 1, 3, 2, 1, 1, 3, 2, 1 };
        assertArrayEquals(ConcatenationOfArray.getConcatenation(nums), output);
    }

}
