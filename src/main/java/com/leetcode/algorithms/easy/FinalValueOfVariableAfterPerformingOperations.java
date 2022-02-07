package com.leetcode.algorithms.easy;

public class FinalValueOfVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int output = 0;
        for (int i = 0; i < operations.length; i++) {
            output = (operations[i].charAt(1) == '+') ? output+1 : output -1;
        }
        return output;
    }

    public static int finalValueAfterOperations1(String[] operations) {
        int output = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X"))
                output += 1;
            else
                output -= 1;
        }
        return output;
    }

    public static int finalValueAfterOperations2(String[] operations) {
        int output = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+"))
                output += 1;
            else
                output -= 1;
        }
        return output;
    }

    public static void main(String[] args) {
        String a = "X++";
        String b = "X++";
        System.out.println(a.charAt(1));
    }
}
