package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2103. Rings and Rods
public class RingsAndRodsTest {

    @Test
    public void Case1 () {
        String rings = "B0B6G0R6R0R6G9";
        int output = 1;
        assertEquals(RingsAndRods.countPoints(rings), output);
    }

    @Test
    public void Case2 () {
        String rings = "B0R0G0R9R0B0G0";
        int output = 1;
        assertEquals(RingsAndRods.countPoints(rings), output);
    }

    @Test
    public void Case3 () {
        String rings = "G4";
        int output = 0;
        assertEquals(RingsAndRods.countPoints(rings), output);
    }

    @Test
    public void Case4 () {
        String rings = "G3R3R7B7R5B1G8G4B3G6";
        int output = 1;
        assertEquals(RingsAndRods.countPoints(rings), output);
    }

}
