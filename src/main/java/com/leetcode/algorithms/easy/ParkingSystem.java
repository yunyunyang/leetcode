package com.leetcode.algorithms.easy;

// 1603. Design Parking System
public class ParkingSystem {

    int[] ps;
    public ParkingSystem(int big, int medium, int small) {
        ps = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (ps[carType - 1] > 0) {
            ps[carType - 1]--;
            return true;
        } else {
            return false;
        }
    }

}
