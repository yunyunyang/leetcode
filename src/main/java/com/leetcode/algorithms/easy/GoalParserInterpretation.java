package com.leetcode.algorithms.easy;

// 1678. Goal Parser Interpretation
public class GoalParserInterpretation {

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] letter = command.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == 'G') {
                sb.append('G');
            } else if (letter[i] == '(' && letter[i+1] == ')') {
                sb.append('o');
                i++;
            } else {
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();
    }

    public static String interpret1(String command) {
        String output = "";
        char[] letter = command.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == 'G') {
                output += "G";
            } else if (letter[i] == '(' && letter[i+1] == ')') {
                output += "o";
            } else if (letter[i] == '(' && letter[i+1] == 'a' &&
                    letter[i+2] == 'l' && letter[i+3] == ')') {
                output += "al";
            }
        }
        return output;
    }

}
