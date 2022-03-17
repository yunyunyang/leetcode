package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1913. Maximum Product Difference Between Two Pairs
public class MaximumProductDifferenceBetweenTwoPairsTest {

    @Test
    public void Case1 () {
        int[] nums = { 5, 6, 2, 7, 4 };
        int output = 34;
        assertEquals(MaximumProductDifferenceBetweenTwoPairs.maxProductDifference(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 4,2,5,9,7,4,8 };
        int output = 64;
        assertEquals(MaximumProductDifferenceBetweenTwoPairs.maxProductDifference(nums), output);
    }

}
