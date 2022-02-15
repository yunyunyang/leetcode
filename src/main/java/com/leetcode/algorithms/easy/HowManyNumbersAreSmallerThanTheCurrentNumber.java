package com.leetcode.algorithms.easy;

import java.util.Arrays;

// 1365. How Many Numbers Are Smaller Than the Current Number
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        int[] ary = new int[101];
        for (int num : nums)
            ary[num] ++;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums[i]; j++)
                count += ary[j];

            output[i] = count;
        }
        return output;
    }

    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] output = new int[nums.length];
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > copy[j])
                    output[i] += 1;
                else
                    break;
            }
        }
        return output;
    }

}
