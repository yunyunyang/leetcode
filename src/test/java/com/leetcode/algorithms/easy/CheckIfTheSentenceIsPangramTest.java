package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1832. Check if the Sentence Is Pangram
public class CheckIfTheSentenceIsPangramTest {

    @Test
    public void Case1 () {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean output = true;
        assertEquals(CheckIfTheSentenceIsPangram.checkIfPangram(sentence), output);
    }

    @Test
    public void Case2 () {
        String sentence = "leetcode";
        boolean output = false;
        assertEquals(CheckIfTheSentenceIsPangram.checkIfPangram(sentence), output);
    }
}
