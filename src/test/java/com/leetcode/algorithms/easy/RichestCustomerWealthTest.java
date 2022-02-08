package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1672. Richest Customer Wealth
public class RichestCustomerWealthTest {

    @Test
    public void Case1 () {
        int[][] accounts = {{ 1, 2, 3 }, { 3, 2, 1 }};
        int output = 6;
        assertEquals(RichestCustomerWealth.maximumWealth(accounts), output);
    }

    @Test
    public void Case2 () {
        int[][] accounts = {{ 1 ,5 }, { 7, 3 }, {3, 5 }};
        int output = 10;
        assertEquals(RichestCustomerWealth.maximumWealth(accounts), output);
    }

    @Test
    public void Case3 () {
        int[][] accounts = {{ 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 }};
        int output = 17;
        assertEquals(RichestCustomerWealth.maximumWealth(accounts), output);
    }

}
