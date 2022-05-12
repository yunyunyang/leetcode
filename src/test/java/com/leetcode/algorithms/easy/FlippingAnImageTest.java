package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 832. Flipping an Image
public class FlippingAnImageTest {

    @Test
    public void Case1 () {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] output = {{1,0,0}, {0,1,0},{1,1,1}};
        assertArrayEquals(FlippingAnImage.flipAndInvertImage(image), output);
    }

    @Test
    public void Case2 () {
        int[][] image = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
        int[][] output = {{1,1,0,0}, {0,1,1,0}, {0,0,0,1}, {1,0,1,0}};
        assertArrayEquals(FlippingAnImage.flipAndInvertImage(image), output);
    }

}
