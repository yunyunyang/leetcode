package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1281. Subtract the Product and Sum of Digits of an Integer
public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

    @Test
    public void Case1 () {
        int n = 234;
        int output = 15;
        assertEquals(SubtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(n), output);
    }

    @Test
    public void Case2 () {
        int n = 4421;
        int output = 21;
        assertEquals(SubtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(n), output);
    }

}
