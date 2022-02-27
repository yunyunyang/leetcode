package com.leetcode.algorithms.easy;

// 1323. Maximum 69 Number
public class Maximum69Number {

    public static int maximum69Number (int num) {
        int output = 0;
        boolean flag = false;
        for (int i = 1000; i > 0; i/=10) {
            int digit = num / i;
            num %= i;

            if (digit == 6 && flag == false) {
                output += 9 * i;
                flag = true;
            } else
                output += digit * i;
        }
        return output;
    }

}
