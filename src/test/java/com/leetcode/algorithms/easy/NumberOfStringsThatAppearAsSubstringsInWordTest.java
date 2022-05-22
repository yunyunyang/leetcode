package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1967. Number of Strings That Appear as Substrings in Word
public class NumberOfStringsThatAppearAsSubstringsInWordTest {

    @Test
    public void Case1 () {
        String[] patterns = { "a", "abc", "bc", "d" };
        String word = "abc";
        int output = 3;
        assertEquals(NumberOfStringsThatAppearAsSubstringsInWord.numOfStrings(patterns, word), output);
    }

    @Test
    public void Case2 () {
        String[] patterns = { "a", "b", "c" };
        String word = "aaaaabbbbb";
        int output = 2;
        assertEquals(NumberOfStringsThatAppearAsSubstringsInWord.numOfStrings(patterns, word), output);
    }

    @Test
    public void Case3 () {
        String[] patterns = { "a", "a", "a" };
        String word = "ab";
        int output = 3;
        assertEquals(NumberOfStringsThatAppearAsSubstringsInWord.numOfStrings(patterns, word), output);
    }

    @Test
    public void Case4 () {
        String[] patterns = { "dojsf","v","hetnovaoigv","ksvqfdojsf","hetnovaoig","yskjs","sfr","msurztkvppptsluk","ndxffbkkvejuakduhdcfsdbgbt","znhdgtwzbnh","h","ocaualfiscmbpnfalypmtdppymw","w","o","sfjksvqfdo","odqvzuc","bozawheajcmlewptgssueylcxhx","bno","jhmarzsphxduvdktzqjiz","j","sfrjhetnov","vxv","ksvqfd","ognwvqtadalmav","yqbspvfwmvhycmghabigl","qyfaiazgdqaw","ojsfrj","ojsfrjhetn","fdojs","do","ovaoig","k","vrh","jsfrjhetnovaoigvgk" };
        String word = "csfjksvqfdojsfrjhetnovaoigvgk";
        int output = 19;
        assertEquals(NumberOfStringsThatAppearAsSubstringsInWord.numOfStrings(patterns, word), output);
    }

}
