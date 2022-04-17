package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2108. Find First Palindromic String in the Array
public class FindFirstPalindromicStringInTheArrayTest {

    @Test
    public void Case1 () {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        String output = "ada";
        assertEquals(FindFirstPalindromicStringInTheArray.firstPalindrome(words), output);
    }

    @Test
    public void Case2 () {
        String[] words = { "notapalindrome", "racecar" };
        String output = "racecar";
        assertEquals(FindFirstPalindromicStringInTheArray.firstPalindrome(words), output);
    }

    @Test
    public void Case3 () {
        String[] words = { "def","ghi" };
        String output = "";
        assertEquals(FindFirstPalindromicStringInTheArray.firstPalindrome(words), output);
    }

}
