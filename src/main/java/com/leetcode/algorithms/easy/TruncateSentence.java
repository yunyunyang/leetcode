package com.leetcode.algorithms.easy;

// 1816. Truncate Sentence
public class TruncateSentence {

    public static String truncateSentence(String s, int k) {
        String[] output = new String[k];
        String[] ary = s.split(" ");
        for (int i = 0; i < k; i++)
            output[i] = ary[i];

        return String.join(" ", output);
    }

}
