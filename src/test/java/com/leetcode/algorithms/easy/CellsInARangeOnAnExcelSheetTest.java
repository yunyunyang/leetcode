package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 2194. Cells in a Range on an Excel Sheet
public class CellsInARangeOnAnExcelSheetTest {

    @Test
    public void Case1 () {
        String s = "K1:L2";
        List<String> output = new ArrayList<String>(Arrays.asList("K1", "K2", "L1", "L2"));
        assertEquals(CellsInARangeOnAnExcelSheet.cellsInRange(s), output);
    }

    @Test
    public void Case2 () {
        String s = "A1:F1";
        List<String> output = new ArrayList<String>(Arrays.asList("A1", "B1", "C1", "D1", "E1", "F1"));
        assertEquals(CellsInARangeOnAnExcelSheet.cellsInRange(s), output);
    }

}
