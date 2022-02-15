package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1486. XOR Operation in an Array
public class XOROperationInAnArrayTest {

    @Test
    public void Case1 () {
        int n = 5;
        int start = 0;
        int output = 8;
        assertEquals(XOROperationInAnArray.xorOperation(n, start), output);
    }

    @Test
    public void Case2 () {
        int n = 4;
        int start = 3;
        int output = 8;
        assertEquals(XOROperationInAnArray.xorOperation(n, start), output);
    }

}
