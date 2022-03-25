package com.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2089. Find Target Indices After Sorting Array
public class FindTargetIndicesAfterSortingArray {

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> output = new ArrayList<Integer>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                output.add(i);
        }
        return output;
    }

}
