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

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        int[] carType = new int[]{ 1, 2, 3, 1 };
        for (int i = 0; i < carType.length; i++) {
            boolean param_1 = obj.addCar(carType[i]);
            System.out.println(param_1);
        }
    }

}
