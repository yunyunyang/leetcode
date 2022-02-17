package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2160. Minimum Sum of Four Digit Number After Splitting Digits
public class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {

    @Test
    public void Case1 () {
        int nums = 2932;
        int output = 52;
        assertEquals(MinimumSumOfFourDigitNumberAfterSplittingDigits.minimumSum(nums), output);
    }

    @Test
    public void Case2 () {
        int nums = 4009;
        int output = 13;
        assertEquals(MinimumSumOfFourDigitNumberAfterSplittingDigits.minimumSum(nums), output);
    }

}
