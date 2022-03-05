package com.leetcode.algorithms.easy;

// 1295. Find Numbers with Even Number of Digits
public class FindNumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int output = 0;
        for (int i : nums)
            output += ((((int)Math.log10(i) + 1) % 2) == 0) ? 1 : 0;

        return output;
    }

}
