package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1295. Find Numbers with Even Number of Digits
public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void Case1 () {
        int[] nums = { 12, 345, 2, 6, 7896 } ;
        int output = 2;
        assertEquals(FindNumbersWithEvenNumberOfDigits.findNumbers(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 555, 901, 482, 1771 } ;
        int output = 1;
        assertEquals(FindNumbersWithEvenNumberOfDigits.findNumbers(nums), output);
    }

}
