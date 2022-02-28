package com.leetcode.algorithms.easy;

// 1732. Find the Highest Altitude
public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int output = 0;
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > output)
                output = altitude;
        }
        return output;
    }

}
