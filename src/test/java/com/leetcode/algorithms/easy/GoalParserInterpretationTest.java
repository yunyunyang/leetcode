package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1678. Goal Parser Interpretation
public class GoalParserInterpretationTest {

    @Test
    public void Case1 () {
        String command = "G()(al)";
        String output = "Goal";
        assertEquals(GoalParserInterpretation.interpret(command), output);
    }

    @Test
    public void Case2 () {
        String command = "G()()()()(al)";
        String output = "Gooooal";
        assertEquals(GoalParserInterpretation.interpret(command), output);
    }

    @Test
    public void Case3 () {
        String command = "(al)G(al)()()G";
        String output = "alGalooG";
        assertEquals(GoalParserInterpretation.interpret(command), output);
    }

}
