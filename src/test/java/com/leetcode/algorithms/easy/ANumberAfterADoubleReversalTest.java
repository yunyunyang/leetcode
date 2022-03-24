package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2119. A Number After a Double Reversal
public class ANumberAfterADoubleReversalTest {

    @Test
    public void Case1 () {
        int num = 526;
        boolean output = true;
        assertEquals(ANumberAfterADoubleReversal.isSameAfterReversals(num), output);
    }

    @Test
    public void Case2 () {
        int num = 1800;
        boolean output = false;
        assertEquals(ANumberAfterADoubleReversal.isSameAfterReversals(num), output);
    }

    @Test
    public void Case3 () {
        int num = 0;
        boolean output = true;
        assertEquals(ANumberAfterADoubleReversal.isSameAfterReversals(num), output);
    }

}
