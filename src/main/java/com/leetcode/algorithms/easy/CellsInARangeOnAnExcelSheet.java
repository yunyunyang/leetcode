package com.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

// 2194. Cells in a Range on an Excel Sheet
public class CellsInARangeOnAnExcelSheet {

    public static List<String> cellsInRange(String s) {
        List<String> output = new ArrayList<String>();
        char c1 = s.charAt(0), c2 = s.charAt(3);
        int r1 = s.charAt(1) - 48, r2 = s.charAt(4) - 48 ;
        for (int i = (int) c1; i <= (int) c2 ; i++) {
            for (int j = r1; j <= r2; j++) {
                String x = String.valueOf((char)i);
                String y = String.valueOf(j);
                output.add(x + y);
            }
        }
        return output;
    }

}
