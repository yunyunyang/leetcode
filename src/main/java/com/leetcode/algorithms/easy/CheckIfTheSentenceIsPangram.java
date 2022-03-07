package com.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

// 1832. Check if the Sentence Is Pangram
public class CheckIfTheSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : sentence.toCharArray()) {
            if (map.size() == 26)
                return true;
            map.put(c, 1);
        }
        return map.size() == 26;
    }

}
