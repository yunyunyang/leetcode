package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2000. Reverse Prefix of Word
public class ReversePrefixOfWordTest {

    @Test
    public void Case1 () {
        char ch = 'd';
        String word = "abcdefd";
        String output = "dcbaefd";
        assertEquals(ReversePrefixOfWord.reversePrefix(word, ch), output);
    }

    @Test
    public void Case2 () {
        char ch = 'z';
        String word = "xyxzxe";
        String output = "zxyxxe";
        assertEquals(ReversePrefixOfWord.reversePrefix(word, ch), output);
    }

    @Test
    public void Case3 () {
        char ch = 'z';
        String word = "abcd";
        String output = "abcd";
        assertEquals(ReversePrefixOfWord.reversePrefix(word, ch), output);
    }

}
