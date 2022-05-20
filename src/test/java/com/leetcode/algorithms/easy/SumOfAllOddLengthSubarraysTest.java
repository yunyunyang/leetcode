package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1588. Sum of All Odd Length Subarrays
public class SumOfAllOddLengthSubarraysTest {

    @Test
    public void Case1 () {
        int[] arr = { 1, 4, 2, 5, 3 };
        int output = 58;
        assertEquals(SumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr), output);
    }

    @Test
    public void Case2 () {
        int[] arr = { 1, 2 };
        int output = 3;
        assertEquals(SumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr), output);
    }

    @Test
    public void Case3 () {
        int[] arr = { 10, 11, 12 };
        int output = 66;
        assertEquals(SumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr), output);
    }

}

