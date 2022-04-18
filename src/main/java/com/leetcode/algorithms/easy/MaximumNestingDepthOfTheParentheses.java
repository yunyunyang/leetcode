package com.leetcode.algorithms.easy;

// 1614. Maximum Nesting Depth of the Parentheses
public class MaximumNestingDepthOfTheParentheses {

    public static int maxDepth(String s) {
        int output = 0;
        int cal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                cal ++;
            if (s.charAt(i) == ')')
                cal --;

            if (cal > output)
                output = cal;
        }
        return output;
    }

}
