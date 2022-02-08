package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//2114. Maximum Number of Words Found in Sentences
public class MaximumNumberOfWordsFoundInSentencesTest {

    @Test
    public void Case1 () {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int output = 6;
        assertEquals(MaximumNumberOfWordsFoundInSentences.mostWordsFound(sentences), output);
    }

    @Test
    public void Case2 () {
        String[] sentences = { "please wait", "continue to fight", "continue to win" };
        int output = 3;
        assertEquals(MaximumNumberOfWordsFoundInSentences.mostWordsFound(sentences), output);
    }

}
