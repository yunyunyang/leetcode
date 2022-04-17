package com.leetcode.algorithms.easy;

// 2108. Find First Palindromic String in the Array
public class FindFirstPalindromicStringInTheArray {

    public static String firstPalindrome(String[] words) {
        String output = "";
        StringBuilder sb = new StringBuilder();
        for(String w : words) {
            sb.append(w);
            if (sb.reverse().toString().equals(w))
                return w;

            sb.delete(0, w.length());
        }
        return output;
    }

    public static String firstPalindrome1(String[] words) {
        String output = "";
        for(String w : words) {
            StringBuilder sb = new StringBuilder(w);
            if (sb.reverse().toString().equals(w))
                return w;
        }
        return output;
    }

}
