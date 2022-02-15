package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 1313. Decompress Run-Length Encoded List
public class DecompressRunLengthEncodedListTest {

    @Test
    public void Case1 () {
        int[] nums = { 1, 2, 3, 4 };
        int[] output = { 2, 4, 4, 4 };
        assertArrayEquals(DecompressRunLengthEncodedList.decompressRLElist(nums), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 1, 2, 3 };
        int[] output = { 1, 3, 3 };
        assertArrayEquals(DecompressRunLengthEncodedList.decompressRLElist(nums), output);
    }

}
