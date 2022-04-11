package com.leetcode.algorithms.easy;

// 1309. Decrypt String from Alphabet to Integer Mapping
public class DecryptStringFromAlphabetToIntegerMapping {

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; ) {
            if (s.charAt(i) == '#') {
                int j = Integer.valueOf(s.substring(i-2, i)) + 'a' - 1;
                sb.append((char)j);
                i-=3;
            } else {
                int j = Integer.valueOf(s.charAt(i) + "") + 'a' - 1;
                sb.append((char)j);
                i--;
            }
        }
        return sb.reverse().toString();
    }

}
