package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 1720. Decode XORed Array
public class DecodeXORedArrayTest {

    @Test
    public void Case1 () {
        int[] encoded = { 1, 2, 3 };
        int first = 1;
        int[] output = { 1, 0, 2, 1 };
        assertArrayEquals(DecodeXORedArray.decode(encoded, first), output);
    }

    @Test
    public void Case2 () {
        int[] encoded = { 6, 2, 7, 3 };
        int first = 4;
        int[] output = { 4, 2, 0, 7, 4 };
        assertArrayEquals(DecodeXORedArray.decode(encoded, first), output);
    }

}
