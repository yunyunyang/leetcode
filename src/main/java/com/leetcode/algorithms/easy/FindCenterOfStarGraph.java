package com.leetcode.algorithms.easy;

// 1791. Find Center of Star Graph
public class FindCenterOfStarGraph {

    public static int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) return edges[0][0];
        if (edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) return edges[0][1];
        return 0;
    }

}
