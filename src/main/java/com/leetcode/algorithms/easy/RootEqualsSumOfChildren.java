package com.leetcode.algorithms.easy;

// 2236. Root Equals Sum of Children
public class RootEqualsSumOfChildren {

    public static boolean checkTree(TreeNode root) {
        return (root.val == root.left.val + root.right.val) ? true : false;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
