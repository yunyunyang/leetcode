package com.leetcode.algorithms.easy;

// 1688. Count of Matches in Tournament
public class CountOfMatchesInTournament {

    public static int numberOfMatches(int n) {
        int output = 0;
        while (n > 0) {
            int ans = Math.floorDiv(n, 2);
            if (ans == 0)
                break;

            output += ans;
            n -= ans;
        }
        return output;
    }

}
