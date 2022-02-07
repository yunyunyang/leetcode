package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

// 1480. Running Sum of 1d Array
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumOf1dArrayTest {

    @Test
    public void Case1 () {
        int[] nums = { 1, 2, 3, 4 };
        int[] output = { 1, 3, 6, 10 };
        assertArrayEquals(RunningSumOf1dArray.runningSum(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 1, 1, 1, 1 };
        int[] output = { 1, 2, 3, 4, 5 };
        assertArrayEquals(RunningSumOf1dArray.runningSum(nums), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 3, 1, 2, 10, 1 };
        int[] output = { 3, 4, 6, 16, 17 };
        assertArrayEquals(RunningSumOf1dArray.runningSum(nums), output);
    }

}
