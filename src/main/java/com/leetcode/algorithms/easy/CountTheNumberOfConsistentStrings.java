package com.leetcode.algorithms.easy;

// 1684. Count the Number of Consistent Strings
public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int output = 0;
        for (String w : words) {
            boolean flag = true;
            for (int i = 0; i < w.length(); i++) {
                String s = w.charAt(i) + "";
                if (!allowed.contains(s)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                output ++;
        }
        return output;
    }

}
