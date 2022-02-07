package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalValueOfVariableAfterPerformingOperationsTest {

    @Test
    public void Case1 () {
        String[] operations = { "--X", "X++", "X++" };
        int output = 1;
        assertEquals(FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations), output);
    }

    @Test
    public void Case2 () {
        String[] operations = { "++X", "++X", "X++" };
        int output = 3;
        assertEquals(FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations), output);
    }

    @Test
    public void Case3 () {
        String[] operations = { "X++", "++X", "--X", "X--" };
        int output = 0;
        assertEquals(FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations), output);
    }

}
