package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1290. Convert Binary Number in a Linked List to Integer
public class ConvertBinaryNumberInALinkedListToIntegerTest {

    @Test
    public void Case1 () {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        int output = 5;
        assertEquals(ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(head), output);
    }

    @Test
    public void Case2 () {
        ListNode head = new ListNode(0);
        int output = 0;
        assertEquals(ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(head), output);
    }

}
