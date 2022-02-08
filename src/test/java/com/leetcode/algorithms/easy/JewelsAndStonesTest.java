package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//771. Jewels and Stones
public class JewelsAndStonesTest {

    @Test
    public void Case1 () {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int output = 3;
        assertEquals(JewelsAndStones.numJewelsInStones(jewels, stones), output);
    }

    @Test
    public void Case2 () {
        String jewels = "z";
        String stones = "ZZ";
        int output = 0;
        assertEquals(JewelsAndStones.numJewelsInStones(jewels, stones), output);
    }

}
