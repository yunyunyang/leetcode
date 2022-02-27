package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2006. Count Number of Pairs With Absolute Difference K
public class CountNumberOfPairsWithAbsoluteDifferenceKTest {

    @Test
    public void Case1 () {
        int[] nums = { 1, 2, 2, 1 };
        int k = 1;
        int output = 4;
        assertEquals(CountNumberOfPairsWithAbsoluteDifferenceK.countKDifference(nums, k), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 3 };
        int k = 3;
        int output = 0;
        assertEquals(CountNumberOfPairsWithAbsoluteDifferenceK.countKDifference(nums, k), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 3, 2, 1, 5, 4 };
        int k = 2;
        int output = 3;
        assertEquals(CountNumberOfPairsWithAbsoluteDifferenceK.countKDifference(nums, k), output);
    }

}
