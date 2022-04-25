package com.leetcode.algorithms.easy;

// 2220. Minimum Bit Flips to Convert Number
public class MinimumBitFlipsToConvertNumber {

    public static int minBitFlips(int start, int goal) {
        int output = 0;
        String s = String.format("%32s", Integer.toBinaryString(start)).replaceAll(" ", "0");
        String g = String.format("%32s", Integer.toBinaryString(goal)).replaceAll(" ", "0");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != g.charAt(i))
                output++;
        }
        return output;
    }

}
