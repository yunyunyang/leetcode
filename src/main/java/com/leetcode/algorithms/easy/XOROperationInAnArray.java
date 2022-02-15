package com.leetcode.algorithms.easy;

// 1486. XOR Operation in an Array
public class XOROperationInAnArray {

    public static int xorOperation(int n, int start) {
        int output = 0;
        int[] ary = new int[n];
        for (int i = 0; i < ary.length; i++)
            ary[i] = start + 2 * i;

        for (int i = 0; i < ary.length; i++)
            output ^= ary[i];

        return output;
    }

}
