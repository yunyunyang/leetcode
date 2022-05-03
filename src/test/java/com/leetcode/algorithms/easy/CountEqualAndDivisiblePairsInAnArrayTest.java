package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2176. Count Equal and Divisible Pairs in an Array
public class CountEqualAndDivisiblePairsInAnArrayTest {

    @Test
    public void Case1 () {
        int[] nums = { 3, 1, 2, 2, 2, 1, 3 };
        int k = 2;
        int output = 4;
        assertEquals(CountEqualAndDivisiblePairsInAnArray.countPairs(nums, k), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 2, 3, 4 };
        int k = 1;
        int output = 0;
        assertEquals(CountEqualAndDivisiblePairsInAnArray.countPairs(nums, k), output);
    }

}
