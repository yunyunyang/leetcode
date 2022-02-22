package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1431. Kids With the Greatest Number of Candies
public class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    public void Case1 () {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        ArrayList<Boolean> output = new ArrayList<Boolean>(Arrays.asList(new Boolean[]{true, true, true, false, true}));
        assertEquals(KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies), output);
    }

    @Test
    public void Case2 () {
        int[] candies = { 4, 2, 1, 1, 2 };
        int extraCandies = 1;
        ArrayList<Boolean> output = new ArrayList<Boolean>(Arrays.asList(new Boolean[]{true, false, false, false, false}));
        assertEquals(KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies), output);
    }

    @Test
    public void Case3 () {
        int[] candies = { 12, 1, 12 };
        int extraCandies = 10;
        ArrayList<Boolean> output = new ArrayList<Boolean>(Arrays.asList(new Boolean[]{true, false, true}));
        assertEquals(KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies), output);
    }

}
