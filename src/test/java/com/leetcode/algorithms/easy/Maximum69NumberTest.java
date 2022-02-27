package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1323. Maximum 69 Number
public class Maximum69NumberTest {

    @Test
    public void Case1 () {
        int nums = 9669;
        int output = 9969;
        assertEquals(Maximum69Number.maximum69Number(nums), output);
    }

    @Test
    public void Case2 () {
        int nums = 9996;
        int output = 9999;
        assertEquals(Maximum69Number.maximum69Number(nums), output);
    }

    @Test
    public void Case3 () {
        int nums = 9999;
        int output = 9999;
        assertEquals(Maximum69Number.maximum69Number(nums), output);
    }

}
