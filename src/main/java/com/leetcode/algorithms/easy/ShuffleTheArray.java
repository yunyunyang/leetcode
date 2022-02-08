package com.leetcode.algorithms.easy;

//1470. Shuffle the Array
public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        int m = 0;
        for (int i = 0; i < n; i+=2) {
            output[i] = nums[m];
            output[i+1] = nums[n];
            n++;
            m++;
        }
        return output;
    }

}
