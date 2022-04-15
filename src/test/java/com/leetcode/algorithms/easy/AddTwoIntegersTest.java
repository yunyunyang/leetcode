package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2235. Add Two Integers
public class AddTwoIntegersTest {

    @Test
    public void Case1 () {
        int num1 = 12;
        int num2 = 5;
        int output = 17;
        assertEquals(AddTwoIntegers.sum(num1, num2), output);
    }

    @Test
    public void Case2 () {
        int num1 = -10;
        int num2 = 4;
        int output = -6;
        assertEquals(AddTwoIntegers.sum(num1, num2), output);
    }

}
