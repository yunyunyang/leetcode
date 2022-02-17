package com.leetcode.algorithms.easy;

import java.util.Arrays;

// 2160. Minimum Sum of Four Digit Number After Splitting Digits
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public static int minimumSum(int num) {
        int[] digit = new int[4];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            digit[i] = num % 10;
            num /= 10;
            index ++;
        }
        Arrays.sort(digit);

        return (digit[0]*10 + digit[2]) + (digit[1]*10 + digit[3]);
    }

    public static int minimumSum2(int num) {
        char[] ary = String.valueOf(num).toCharArray();
        Arrays.sort(ary);

        StringBuilder sba = new StringBuilder();
        sba.append(ary[0]).append(ary[2]);

        StringBuilder sbb = new StringBuilder();
        sbb.append(ary[1]).append(ary[3]);

        return Integer.parseInt(sba.toString()) + Integer.parseInt(sbb.toString());
    }

    public static int minimumSum1(int num) {
        char[] ary = String.valueOf(num).toCharArray();
        Arrays.sort(ary);

        String a = String.valueOf(ary[0]) + String.valueOf(ary[2]);
        String b = String.valueOf(ary[1]) + String.valueOf(ary[3]);

        return Integer.parseInt(a) + Integer.parseInt(b);
    }

}
