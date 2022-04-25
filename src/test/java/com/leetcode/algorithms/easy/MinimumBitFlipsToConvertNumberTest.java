package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2220. Minimum Bit Flips to Convert Number
public class MinimumBitFlipsToConvertNumberTest {

    @Test
    public void Case1 () {
        int start = 10, goal = 7;
        int output = 3;
        assertEquals(MinimumBitFlipsToConvertNumber.minBitFlips(start, goal), output);
    }

    @Test
    public void Case2 () {
        int start = 3, goal = 4;
        int output = 3;
        assertEquals(MinimumBitFlipsToConvertNumber.minBitFlips(start, goal), output);
    }

    @Test
    public void Case3 () {
        int start = 3015, goal = 2818;
        int output = 4;
        assertEquals(MinimumBitFlipsToConvertNumber.minBitFlips(start, goal), output);
    }

}
