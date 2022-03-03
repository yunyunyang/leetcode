package com.leetcode.algorithms.easy;

import java.util.Arrays;

// 1464. Maximum Product of Two Elements in an Array
public class MaximumProductOfTwoElementsInAnArray {

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

}
