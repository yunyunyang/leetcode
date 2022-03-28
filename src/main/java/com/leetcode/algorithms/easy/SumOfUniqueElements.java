package com.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

// 1748. Sum of Unique Elements
public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {
        int output = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for (int i : map.keySet()) {
            if (map.get(i) == 1)
                output += i;
        }
        return output;
    }
}
