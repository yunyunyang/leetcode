package com.leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

// 2103. Rings and Rods
public class RingsAndRods {

    public static int countPoints(String rings) {
        int output = 0;
        if (rings.length() < 6 )
            return 0;

        for (int i = 0; i < rings.length(); i++) {
            String r = "R" + i, g = "G" + i, b = "B" + i;
            if (rings.indexOf(r) != -1 && rings.indexOf(g)  != -1 &&
                    rings.indexOf(b) != -1 ) {
                output ++;
            }
        }
        return output;
    }

}
