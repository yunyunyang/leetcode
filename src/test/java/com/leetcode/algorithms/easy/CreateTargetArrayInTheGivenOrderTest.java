package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 1389. Create Target Array in the Given Order
public class CreateTargetArrayInTheGivenOrderTest {

    @Test
    public void Case1 () {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] output = { 0, 4, 1, 3, 2 };
        assertArrayEquals(CreateTargetArrayInTheGivenOrder.createTargetArray(nums, index), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 2, 3, 4, 0 };
        int[] index = { 0, 1, 2, 3, 0 };
        int[] output = { 0, 1, 2, 3, 4 };
        assertArrayEquals(CreateTargetArrayInTheGivenOrder.createTargetArray(nums, index), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 1 };
        int[] index = { 0 };
        int[] output = { 1 };
        assertArrayEquals(CreateTargetArrayInTheGivenOrder.createTargetArray(nums, index), output);
    }

}
