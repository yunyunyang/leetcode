package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

//1470. Shuffle the Array
public class ShuffleTheArrayTest {

    @Test
    public void Case1 () {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] output = { 2, 3, 5, 4, 1, 7 };
        assertArrayEquals(ShuffleTheArray.shuffle(nums, n), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int n = 4;
        int[] output = { 1, 4, 2, 3, 3, 2, 4, 1 };
        assertArrayEquals(ShuffleTheArray.shuffle(nums, n), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 1, 1, 2, 2 };
        int n = 2;
        int[] output = { 1, 2, 1, 2 };
        assertArrayEquals(ShuffleTheArray.shuffle(nums, n), output);
    }

}
