package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1512. Number of Good Pairs
public class NumberOfGoodPairsTest {

    @Test
    public void Case1 () {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int output = 4;
        assertEquals(NumberOfGoodPairs.numIdenticalPairs(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 1, 1, 1 };
        int output = 6;
        assertEquals(NumberOfGoodPairs.numIdenticalPairs(nums), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 1, 2, 3 };
        int output = 0;
        assertEquals(NumberOfGoodPairs.numIdenticalPairs(nums), output);
    }

}
