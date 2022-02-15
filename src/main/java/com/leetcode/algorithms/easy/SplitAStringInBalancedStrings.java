package com.leetcode.algorithms.easy;

// 1221. Split a String in Balanced Strings
public class SplitAStringInBalancedStrings {

    public static int balancedStringSplit(String s) {
        int output = 0;
        int balanced = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R')
                balanced ++;
            else
                balanced --;

            if (balanced == 0)
                output ++;
        }
        return output;
    }

}
