package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1614. Maximum Nesting Depth of the Parentheses
public class MaximumNestingDepthOfTheParenthesesTest {

    @Test
    public void Case1 () {
        String s = "(1+(2*3)+((8)/4))+1";
        int output = 3;
        assertEquals(MaximumNestingDepthOfTheParentheses.maxDepth(s), output);
    }

    @Test
    public void Case2 () {
        String s = "(1)+((2))+(((3)))";
        int output = 3;
        assertEquals(MaximumNestingDepthOfTheParentheses.maxDepth(s), output);
    }

}
