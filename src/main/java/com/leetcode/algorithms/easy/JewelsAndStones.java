package com.leetcode.algorithms.easy;

//771. Jewels and Stones
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int output = 0;
        int[] cary = new int[128];
        for (char s : stones.toCharArray())
            cary[(int)s]++;

        for (char j : jewels.toCharArray())
            output += cary[j];

        return output;
    }

    public static int numJewelsInStones1(String jewels, String stones) {
        int output = 0;
        char[] jewelsAry = jewels.toCharArray();
        char[] stonesAry = stones.toCharArray();
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewelsAry.length; j++) {
                if (stonesAry[i] == jewelsAry[j])
                    output++;
            }
        }
        return output;
    }

}
