package com.leetcode.algorithms.easy;

// 2176. Count Equal and Divisible Pairs in an Array
public class CountEqualAndDivisiblePairsInAnArray {

    public static int countPairs(int[] nums, int k) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0)
                    output++;
            }
        }
        return output;
    }

}
