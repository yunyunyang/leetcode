package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 728. Self Dividing Numbers
public class SelfDividingNumbersTest {

    @Test
    public void Case1 () {
        int left = 1;
        int right = 22;
        List<Integer> output = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
        assertEquals(SelfDividingNumbers.selfDividingNumbers(left, right), output);
    }

    @Test
    public void Case2 () {
        int left = 47;
        int right = 85;
        List<Integer> output = new ArrayList<Integer>(Arrays.asList(48, 55, 66, 77));
        assertEquals(SelfDividingNumbers.selfDividingNumbers(left, right), output);
    }

    @Test
    public void Case3 () {
        int left = 66;
        int right = 708;
        List<Integer> output = new ArrayList<Integer>(
                Arrays.asList(66,77,88,99,111,112,115,122,124,126,128,132,135,144,155,162,168,175,184,212,216,222,224,244,248,264,288,312,315,324,333,336,366,384,396,412,424,432,444,448,488,515,555,612,624,636,648,666,672));
        assertEquals(SelfDividingNumbers.selfDividingNumbers(left, right), output);
    }

}
