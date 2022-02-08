package com.leetcode.algorithms.easy;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences {

    public static int mostWordsFound(String[] sentences) {
        int output = 0;
        for (int i = 0; i < sentences.length; i++) {
            output = Math.max(output, (sentences[i].split(" ").length));
        }
        return output;
    }

    public static int mostWordsFound1(String[] sentences) {
        int output = -1;
        for (int i = 0; i < sentences.length; i++) {
            int count = sentences[i].split(" ").length;
            if (count > output)
                output = count;
        }
        return output;
    }

}
