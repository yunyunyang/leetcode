package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1791. Find Center of Star Graph
public class FindCenterOfStarGraphTest {

    @Test
    public void Case1 () {
        int[][] edges = {{ 1,2 }, { 2,3 }, { 4,2 }};
        int output = 2;
        assertEquals(FindCenterOfStarGraph.findCenter(edges), output);
    }

    @Test
    public void Case2 () {
        int[][] edges = {{ 1,2 }, { 5,1 }, { 1,3 }, { 1,4 }};
        int output = 1;
        assertEquals(FindCenterOfStarGraph.findCenter(edges), output);
    }

}
