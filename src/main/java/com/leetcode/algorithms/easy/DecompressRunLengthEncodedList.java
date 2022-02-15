package com.leetcode.algorithms.easy;

// 1313. Decompress Run-Length Encoded List
public class DecompressRunLengthEncodedList {

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i+=2)
            size += nums[i];

        int[] output = new int[size];
        int index = 0;
        for (int i = 0; i < nums.length; i+=2) {   // freq
            for (int j = 0; j < nums[i]; j++) { // val
                output[index] = nums[i+1];
                index ++;
            }
        }
        return output;
    }

}
