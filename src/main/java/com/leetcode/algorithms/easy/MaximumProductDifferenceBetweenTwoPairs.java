package com.leetcode.algorithms.easy;

import java.util.Arrays;

// 1913. Maximum Product Difference Between Two Pairs
public class MaximumProductDifferenceBetweenTwoPairs {

    public static int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n-1] * nums[n-2]) - (nums[0] * nums[1]);
    }

}
