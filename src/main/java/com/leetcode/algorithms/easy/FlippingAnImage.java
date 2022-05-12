package com.leetcode.algorithms.easy;

// 832. Flipping an Image
public class FlippingAnImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        int[][] reversedImage = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int index = Math.abs(j - size + 1);
                reversedImage[i][j] = image[i][index]^1;
            }
        }
        return reversedImage;
    }

}
