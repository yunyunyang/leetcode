package com.leetcode.algorithms.easy;

// 1837. Sum of Digits in Base K
public class SumOfDigitsInBaseK {

    public static int sumBase(int n, int k) {
        int output = 0;
        for (char i : Integer.toString(n, k).toCharArray()) {
            output += Integer.valueOf(String.valueOf(i));
        }
        return output;
    }

}
