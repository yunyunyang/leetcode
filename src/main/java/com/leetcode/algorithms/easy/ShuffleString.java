package com.leetcode.algorithms.easy;

// 1528. Shuffle String
public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        char[] output = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
            output[indices[i]] = s.charAt(i);

        return String.valueOf(output);
    }

}
