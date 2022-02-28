package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1732. Find the Highest Altitude
public class FindTheHighestAltitudeTest {

    @Test
    public void Case1 () {
        int[] gain = { -5, 1, 5, 0, -7 };
        int output = 1;
        assertEquals(FindTheHighestAltitude.largestAltitude(gain), output);
    }

    @Test
    public void Case2 () {
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        int output = 0;
        assertEquals(FindTheHighestAltitude.largestAltitude(gain), output);
    }

}
