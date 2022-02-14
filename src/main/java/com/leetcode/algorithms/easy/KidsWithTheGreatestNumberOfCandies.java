package com.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<Boolean>();
        int greatest = 0;
        for (int candy : candies)
            greatest = (candy > greatest) ? candy : greatest;

        for (int candy : candies)
            output.add(candy + extraCandies >= greatest);

        return output;
    }

}
