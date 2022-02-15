package com.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

// 1389. Create Target Array in the Given Order
public class CreateTargetArrayInTheGivenOrder {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);

        for (int i = 0; i < list.size(); i++)
            output[i] = list.get(i);

        return output;
    }

}
