package com.leetcode.algorithms.easy;

// 1281. Subtract the Product and Sum of Digits of an Integer
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n/10 > 0 || (n < 10 && n > 0)) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }

}
