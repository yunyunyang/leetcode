package com.leetcode.algorithms.easy;

// 1480. Running Sum of 1d Array
public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i] + output[i-1];
        }
        return output;
    }

    public static int[] runningSum1(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                output[i] = nums[i];
            else
                output[i] = nums[i] + output[i-1];
        }
        return output;
    }

}
