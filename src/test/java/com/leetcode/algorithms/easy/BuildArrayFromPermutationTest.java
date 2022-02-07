package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 1920. Build Array from Permutation
public class BuildArrayFromPermutationTest {

    @Test
    public void Case1 () {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] output = { 0, 1, 2, 4, 5, 3 };
        assertArrayEquals(BuildArrayFromPermutation.buildArray(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        int[] output = { 4, 5, 0, 1, 2, 3 };
        assertArrayEquals(BuildArrayFromPermutation.buildArray(nums), output);
    }
}
