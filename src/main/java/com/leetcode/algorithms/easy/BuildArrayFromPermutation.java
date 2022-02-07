package com.leetcode.algorithms.easy;

// 1920. Build Array from Permutation
public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            output[i] = nums[j];
        }
        return output;
    }

}
