package com.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

// 728. Self Dividing Numbers
public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (!String.valueOf(i).contains("0")) {
                boolean dividable = true;
                int j = i;
                while (j % 10 != 0) {
                    int r = j % 10;
                    if (i % r != 0) {
                        dividable = false;
                        break;
                    }
                    j /= 10;
                }
                if (dividable)
                    output.add(i);
            }
        }
        return output;
    }

}
