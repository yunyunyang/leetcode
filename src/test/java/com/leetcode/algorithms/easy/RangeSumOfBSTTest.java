package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 938. Range Sum of BST
public class RangeSumOfBSTTest {

    @Test
    public void Case1 () {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(15);
        root.right.right = new TreeNode(18);

        int low = 7, high = 15;
        int output = 32;
        RangeSumOfBST bst = new RangeSumOfBST();
        assertEquals(bst.rangeSumBST(root, low, high), output);
    }

    @Test
    public void Case2 () {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(7);
        root.left.right.left = new TreeNode(6);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        int low = 6, high = 10;
        int output = 23;
        RangeSumOfBST bst = new RangeSumOfBST();
        assertEquals(bst.rangeSumBST(root, low, high), output);
    }

}
