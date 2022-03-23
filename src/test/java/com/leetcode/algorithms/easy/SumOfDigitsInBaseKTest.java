package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1837. Sum of Digits in Base K
public class SumOfDigitsInBaseKTest {

    @Test
    public void Case1 () {
        int n = 34;
        int k = 6;
        int output = 9;
        assertEquals(SumOfDigitsInBaseK.sumBase(n, k), output);
    }

    @Test
    public void Case2 () {
        int n = 10;
        int k = 10;
        int output = 1;
        assertEquals(SumOfDigitsInBaseK.sumBase(n, k), output);
    }

}
