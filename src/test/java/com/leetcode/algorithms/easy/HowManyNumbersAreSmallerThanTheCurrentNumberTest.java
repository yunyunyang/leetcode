package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 1365. How Many Numbers Are Smaller Than the Current Number
public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    public void Case1 () {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] output = { 4, 0, 1, 1, 3 };
        assertArrayEquals(HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 6, 5, 4, 8 };
        int[] output = { 2, 1, 0, 3 };
        assertArrayEquals(HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 7, 7, 7, 7 };
        int[] output = { 0, 0, 0, 0 };
        assertArrayEquals(HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(nums), output);
    }

}
