package com.leetcode.algorithms.easy;

// 1844. Replace All Digits with Characters
public class ReplaceAllDigitsWithCharacters {

    public static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            } else {
                int letter = s.charAt(i - 1) + s.charAt(i) - 48;
                sb.append((char)letter);
            }
        }
        return sb.toString();
    }

    public static String replaceDigits1(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                output += s.charAt(i);;
            } else {
                int letter = s.charAt(i - 1) + s.charAt(i) - 48;
                output += (char) letter;
            }
        }
        return output;
    }

}
