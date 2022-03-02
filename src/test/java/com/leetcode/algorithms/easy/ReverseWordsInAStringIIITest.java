package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 557. Reverse Words in a String III
public class ReverseWordsInAStringIIITest {

    @Test
    public void Case1 () {
        String s = "Let's take LeetCode contest";
        String output = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(ReverseWordsInAStringIII.reverseWords(s), output);
    }

    @Test
    public void Case2 () {
        String s = "God Ding";
        String output = "doG gniD";
        assertEquals(ReverseWordsInAStringIII.reverseWords(s), output);
    }

}
