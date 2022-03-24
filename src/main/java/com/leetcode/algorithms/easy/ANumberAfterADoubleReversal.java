package com.leetcode.algorithms.easy;

// 2119. A Number After a Double Reversal
public class ANumberAfterADoubleReversal {

    public static boolean isSameAfterReversals(int num) {
        if (num == 0 || num % 10 != 0)
            return true;
        else
            return false;
    }

}
