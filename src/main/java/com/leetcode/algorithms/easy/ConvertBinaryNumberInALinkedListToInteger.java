package com.leetcode.algorithms.easy;

import java.util.*;

// 1290. Convert Binary Number in a Linked List to Integer
public class ConvertBinaryNumberInALinkedListToInteger {

    public static int getDecimalValue(ListNode head) {
        int output = 0;

        List<Integer> list = new LinkedList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            output += (int)Math.pow(2, i) * list.get(i);
        }
        return output;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}