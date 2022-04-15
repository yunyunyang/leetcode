package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2236. Root Equals Sum of Children
public class RootEqualsSumOfChildrenTest {

    @Test
    public void Case1 () {
        TreeNode root = new TreeNode(10, new TreeNode(4), new TreeNode(6));
        boolean output = true;
        assertEquals(RootEqualsSumOfChildren.checkTree(root), output);
    }

    @Test
    public void Case2 () {
        TreeNode root = new TreeNode(5, new TreeNode(3), new TreeNode(1));
        boolean output = false;
        assertEquals(RootEqualsSumOfChildren.checkTree(root), output);
    }

}
