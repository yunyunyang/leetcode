package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1688. Count of Matches in Tournament
public class CountOfMatchesInTournamentTest {

    @Test
    public void Case1 () {
        int n = 7;
        int output = 6;
        assertEquals(CountOfMatchesInTournament.numberOfMatches(n), output);
    }

    @Test
    public void Case2 () {
        int n = 14;
        int output = 13;
        assertEquals(CountOfMatchesInTournament.numberOfMatches(n), output);
    }

}
