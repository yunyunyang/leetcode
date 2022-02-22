package com.leetcode.algorithms.easy;

import java.util.List;

// 1773. Count Items Matching a Rule
public class CountItemsMatchingARule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int output = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) output++;
            if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) output++;
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) output++;
        }
        return output;
    }

}
