package com.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//1108. Defanging an IP Address
public class DefangingAnIPAddressTest {

    @Test
    public void Case1 () {
        String address = "1.1.1.1";
        String output = "1[.]1[.]1[.]1";
        assertEquals(DefangingAnIPAddress.defangIPaddr(address), output);
    }

    @Test
    public void Case2 () {
        String address = "255.100.50.0";
        String output = "255[.]100[.]50[.]0";
        assertEquals(DefangingAnIPAddress.defangIPaddr(address), output);
    }

}
