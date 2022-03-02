package com.leetcode.algorithms.easy;

// 557. Reverse Words in a String III
public class ReverseWordsInAStringIII {

    public static String reverseWords(String s) {
        String[] output = s.split(" ");
        for (int i = 0; i < output.length; i++) {
            StringBuilder sb = new StringBuilder(output[i]);
            output[i] = sb.reverse().toString();
        }
        return String.join(" ", output);
    }

}
