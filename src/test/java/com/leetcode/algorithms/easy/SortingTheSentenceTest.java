package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1859. Sorting the Sentence
public class SortingTheSentenceTest {

    @Test
    public void Case1 () {
        String s = "is2 sentence4 This1 a3";
        String output = "This is a sentence";
        assertEquals(SortingTheSentence.sortSentence(s), output);
    }

    @Test
    public void Case2 () {
        String s = "Myself2 Me1 I4 and3";
        String output = "Me Myself and I";
        assertEquals(SortingTheSentence.sortSentence(s), output);
    }

}
