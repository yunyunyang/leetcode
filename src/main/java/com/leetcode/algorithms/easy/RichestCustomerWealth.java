package com.leetcode.algorithms.easy;

// 1672. Richest Customer Wealth
public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int output = -1;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > output)
                output = wealth;
        }
        return output;
    }

}
