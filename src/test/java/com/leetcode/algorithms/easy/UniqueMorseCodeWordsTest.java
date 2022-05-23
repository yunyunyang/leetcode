package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 804. Unique Morse Code Words
public class UniqueMorseCodeWordsTest {

    @Test
    public void Case1 () {
        String[] words = { "gin", "zen", "gig", "msg" };
        int output = 2;
        assertEquals(UniqueMorseCodeWords.uniqueMorseRepresentations(words), output);
    }

    @Test
    public void Case2 () {
        String[] words = { "a" };
        int output = 1;
        assertEquals(UniqueMorseCodeWords.uniqueMorseRepresentations(words), output);
    }

}
