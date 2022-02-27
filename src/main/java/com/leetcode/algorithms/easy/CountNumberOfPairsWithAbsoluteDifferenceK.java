package com.leetcode.algorithms.easy;

// 2006. Count Number of Pairs With Absolute Difference K
public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public static int countKDifference(int[] nums, int k) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int ans = nums[i] - nums[j];
                if (Math.abs(ans) == k) output++;
            }
        }
        return output;
    }

}
