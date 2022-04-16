package com.leetcode.algorithms.easy;

import java.util.Arrays;

// 2037. Minimum Number of Moves to Seat Everyone
public class MinimumNumberOfMovesToSeatEveryone {

    public static int minMovesToSeat(int[] seats, int[] students) {
        int output = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            output += Math.abs(seats[i] - students[i]);
        }
        return output;
    }

}
