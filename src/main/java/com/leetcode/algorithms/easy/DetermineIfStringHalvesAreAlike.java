package com.leetcode.algorithms.easy;

// 1704. Determine if String Halves Are Alike
public class DetermineIfStringHalvesAreAlike {

    public static boolean halvesAreAlike(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 65 || s.charAt(i) == 69 || s.charAt(i) == 73 || s.charAt(i) == 79 || s.charAt(i) == 85 ||
                    s.charAt(i) == 97 || s.charAt(i) == 101 || s.charAt(i) == 105 || s.charAt(i) == 111 || s.charAt(i) == 117 ) {

                if (i < s.length()/2) a ++;
                else b++;
            }
        }
        return a == b;
    }

}
