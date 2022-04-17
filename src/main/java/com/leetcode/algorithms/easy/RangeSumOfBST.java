package com.leetcode.algorithms.easy;

// 938. Range Sum of BST
public class RangeSumOfBST {

    public int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        traverse(root, low, high);
        return sum;
    }

    void traverse(TreeNode node, int low, int high) {
        if (node == null)
            return;

        if (node.val >= low && node.val <= high)
            sum += node.val;
        if (node.val > low)
            traverse(node.left, low, high);
        if (node.val < high)
            traverse(node.right, low, high);
    }

}
