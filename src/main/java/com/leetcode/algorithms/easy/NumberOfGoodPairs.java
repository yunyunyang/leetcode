package com.leetcode.algorithms.easy;

// 1512. Number of Good Pairs
public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    output++;
                }
            }
        }
        return output;
    }

}
