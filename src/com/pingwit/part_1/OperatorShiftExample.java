package com.pingwit.part_1;

public class OperatorShiftExample {
    public static void main(String[] args) {
        // >>, <<
        System.out.println(4);
        // 4, 2, 1 -> 0, 0, 1 -> 1,0,0 , 6, 3, 1 -> 0, 1, 1
        System.out.println(0b100);
        // 1,0,0 << 2 -> 1,0,0,0,0
        // 1,0,0,0,0 -> (1 * 2^4) + (0 * 2^3) + (0 * 2^2) + (0 * 2^1) + (0 * 2^0) -> 16

        System.out.println(4 << 2); // 4 * 4 -> 16
        System.out.println(6 << 2); // 6 * 4 -> 24

        System.out.println(2 << 30);
        System.out.println(2 << 31);

        long name = 2;
        System.out.println(name << 31);
        System.out.println(2L << 31);

        // 1,0,0 -> 4 >> 2 -> 0,0,1
        System.out.println(0b001);
        System.out.println(4 >> 2); // 4 / 4 -> 1
        System.out.println(8 >> 2); // 8 / 4 -> 2
        System.out.println(18 >> 3); // 18 / 9 -> 2

    }
}
