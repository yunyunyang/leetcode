package com.leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

// 804. Unique Morse Code Words
public class UniqueMorseCodeWords {

    public static int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1)
            return 1;

        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<String>();
        for (String word : words) {
            String code = "";
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 97;
                code += morse[index];
            }
            set.add(code);
        }
        return set.size();
    }
}
