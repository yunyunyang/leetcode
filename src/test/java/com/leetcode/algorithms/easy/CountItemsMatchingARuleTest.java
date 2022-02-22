package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1773. Count Items Matching a Rule
public class CountItemsMatchingARuleTest {

    @Test
    public void Case1 () {
        List<List<String>> items = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"), Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        int output = 1;
        assertEquals(CountItemsMatchingARule.countMatches(items, ruleKey, ruleValue), output);
    }

    @Test
    public void Case2 () {
        List<List<String>> items = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "phone"), Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        int output = 2;
        assertEquals(CountItemsMatchingARule.countMatches(items, ruleKey, ruleValue), output);
    }

}
