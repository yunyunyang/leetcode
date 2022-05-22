package com.leetcode.algorithms.easy;

// 1967. Number of Strings That Appear as Substrings in Word
public class NumberOfStringsThatAppearAsSubstringsInWord {

    public static int numOfStrings(String[] patterns, String word) {
        int output = 0;
        for (String pattern : patterns) {
            boolean flag = true;
            if (!word.contains(pattern)) {
                flag = false;
            }
            if (flag)
                output++;
        }
        return output;
    }

}
