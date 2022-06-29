package com.leetcode.algorithms.easy;

// 2315. Count Asterisks
public class CountAsterisks {

    public static int countAsterisks(String s) {
        int output = 0;
        if (s.indexOf('|') == -1) {
            return s.length() - s.replace("*", "").length();
        } else {
            String[] chunks = s.split("\\|");
            for (int i = 0; i < chunks.length; i+=2) {
                int occurrence = chunks[i].length() - chunks[i].replace("*", "").length();
                output += occurrence;
            }
        }
        return output;
    }

}
