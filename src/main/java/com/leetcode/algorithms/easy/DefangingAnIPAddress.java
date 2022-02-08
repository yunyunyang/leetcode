package com.leetcode.algorithms.easy;

// 1108. Defanging an IP Address
public class DefangingAnIPAddress {

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
