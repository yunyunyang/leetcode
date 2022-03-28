package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1748. Sum of Unique Elements
public class SumOfUniqueElementsTest {

    @Test
    public void Case1 () {
        int[] nums = { 1, 2, 3, 2 };
        int output = 4;
        assertEquals(SumOfUniqueElements.sumOfUnique(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 1, 1, 1, 1 };
        int output = 0;
        assertEquals(SumOfUniqueElements.sumOfUnique(nums), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 1, 2, 3, 4, 5 };
        int output = 15;
        assertEquals(SumOfUniqueElements.sumOfUnique(nums), output);
    }

}
