package com.leetcode.algorithms.easy;

// 2000. Reverse Prefix of Word
public class ReversePrefixOfWord {

    public static String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) == -1)
            return word;

        int divider = word.indexOf(ch);
        String first = word.substring(0, divider+1);
        String second = word.substring(divider+1, word.length());

        StringBuilder sb = new StringBuilder(first);
        return sb.reverse().toString() + second;
    }

}
