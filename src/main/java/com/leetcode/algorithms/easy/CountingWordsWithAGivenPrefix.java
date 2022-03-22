package com.leetcode.algorithms.easy;

// 2185. Counting Words With a Given Prefix
public class CountingWordsWithAGivenPrefix {

    public static int prefixCount(String[] words, String pref) {
        int output = 0;
        for (String word : words) {
            output += (word.indexOf(pref) == 0) ? 1 : 0;
        }
        return output;
    }

}
