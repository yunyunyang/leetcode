package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1342. Number of Steps to Reduce a Number to Zero
public class NumberOfStepsToReduceANumberToZeroTest {

    @Test
    public void Case1 () {
        int num = 14;
        int output = 6;
        assertEquals(NumberOfStepsToReduceANumberToZero.numberOfSteps(num), output);
    }

    @Test
    public void Case2 () {
        int num = 8;
        int output = 4;
        assertEquals(NumberOfStepsToReduceANumberToZero.numberOfSteps(num), output);
    }

}
