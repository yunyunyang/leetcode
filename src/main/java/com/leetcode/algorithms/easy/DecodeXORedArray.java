package com.leetcode.algorithms.easy;

// 1720. Decode XORed Array
public class DecodeXORedArray {

    public static int[] decode(int[] encoded, int first) {
        int[] output = new int[encoded.length + 1];
        output[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            output[i+1] = output[i] ^ encoded[i];
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(2^1);
    }

}
