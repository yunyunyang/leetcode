package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1816. Truncate Sentence
public class TruncateSentenceTest {

    @Test
    public void Case1 () {
        String s = "Hello how are you Contestant";
        int k = 4;
        String output = "Hello how are you";
        assertEquals(TruncateSentence.truncateSentence(s, k), output);
    }

    @Test
    public void Case2 () {
        String s = "What is the solution to this problem";
        int k = 4;
        String output = "What is the solution";
        assertEquals(TruncateSentence.truncateSentence(s, k), output);
    }

    @Test
    public void Case3 () {
        String s = "chopper is not a tanuki";
        int k = 5;
        String output = "chopper is not a tanuki";
        assertEquals(TruncateSentence.truncateSentence(s, k), output);
    }

}
