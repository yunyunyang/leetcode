package com.leetcode.algorithms.easy;

import java.util.Arrays;

// 1859. Sorting the Sentence
public class SortingTheSentence {

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] output = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            int index = words[i].charAt(words[i].length()-1) - '1';
            String word = words[i].substring(0, words[i].length() - 1);
            output[index] = word;
        }
        return String.join(" ", output);
    }

    public static String sortSentence1(String s) {
        String[] words = s.split(" ");
        String[] output = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            int index = Integer.valueOf(words[i].substring(len-1, len));
            String word = words[i].substring(0, len-1);
            output[index-1] = word;
        }
        return Arrays.toString(output).replace("[", "").replace("]", "").replace(",", "");
    }

}
