package com.leetcode.algorithms.easy;

// 1929. Concatenation of Array
public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] output = new int [size * 2];
        for (int i = 0; i < nums.length; i++) {
            output[i]  = output[nums.length + i] = nums[i];
        }
        return output;
    }

    public static int[] getConcatenation1(int[] nums) {
        int[] output = new int [nums.length * 2];
        System.arraycopy(nums, 0, output, 0, nums.length);
        System.arraycopy(nums, 0, output, nums.length, nums.length);
        return output;
    }

}
