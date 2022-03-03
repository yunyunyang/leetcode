package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1464. Maximum Product of Two Elements in an Array
public class MaximumProductOfTwoElementsInAnArrayTest {

    @Test
    public void Case1 () {
        int[] nums = { 3, 4, 5, 2 };
        int output = 12;
        assertEquals(MaximumProductOfTwoElementsInAnArray.maxProduct(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 5, 4, 5 };
        int output = 16;
        assertEquals(MaximumProductOfTwoElementsInAnArray.maxProduct(nums), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 3, 7 };
        int output = 12;
        assertEquals(MaximumProductOfTwoElementsInAnArray.maxProduct(nums), output);
    }

}
