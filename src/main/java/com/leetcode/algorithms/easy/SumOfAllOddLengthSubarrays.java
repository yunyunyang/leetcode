package com.leetcode.algorithms.easy;

// 1588. Sum of All Odd Length Subarrays
public class SumOfAllOddLengthSubarrays {

    public static int sumOddLengthSubarrays(int[] arr) {
        int output = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j+=2) {
                for (int k = i; k < j && k < arr.length; k++) {
                    output += arr[k];
                }
            }
        }
        return output;
    }

}
