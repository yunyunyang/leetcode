package com.leetcode.algorithms.easy;

// 1342. Number of Steps to Reduce a Number to Zero
public class NumberOfStepsToReduceANumberToZero {

    public static int numberOfSteps(int num) {
        int output = 0;
        while (num > 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;
            output += 1;
        }
        return output;
    }

}
