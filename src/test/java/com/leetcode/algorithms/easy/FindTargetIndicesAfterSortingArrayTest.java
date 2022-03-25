package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2089. Find Target Indices After Sorting Array
public class FindTargetIndicesAfterSortingArrayTest {

    @Test
    public void Case1 () {
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;
        List<Integer> output = new ArrayList<Integer>(Arrays.asList(1, 2));
        assertEquals(FindTargetIndicesAfterSortingArray.targetIndices(nums, target), output);
    }

    @Test
    public void Case2 () {
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 3;
        List<Integer> output = new ArrayList<Integer>(Arrays.asList(3));
        assertEquals(FindTargetIndicesAfterSortingArray.targetIndices(nums, target), output);
    }

    @Test
    public void Case3 () {
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 5;
        List<Integer> output = new ArrayList<Integer>(Arrays.asList(4));
        assertEquals(FindTargetIndicesAfterSortingArray.targetIndices(nums, target), output);
    }

}
