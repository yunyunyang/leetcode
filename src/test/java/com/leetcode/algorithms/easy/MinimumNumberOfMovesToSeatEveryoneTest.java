package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2037. Minimum Number of Moves to Seat Everyone
public class MinimumNumberOfMovesToSeatEveryoneTest {

    @Test
    public void Case1 () {
        int[] seats = { 3, 1, 5 };
        int[] students = { 2, 7, 4 };
        int output = 4;
        assertEquals(MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students), output);
    }

    @Test
    public void Case2 () {
        int[] seats = { 4, 1, 5, 9 };
        int[] students = { 1, 3, 2, 6 };
        int output = 7;
        assertEquals(MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students), output);
    }

    @Test
    public void Case3 () {
        int[] seats = { 2, 2, 6, 6 };
        int[] students = { 1, 3, 2, 6 };
        int output = 4;
        assertEquals(MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students), output);
    }

}
