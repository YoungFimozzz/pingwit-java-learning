package com.pingwit.part_1;

public class OperatorShortenedExample {
    public static void main(String[] args) {
        int x = 100;
        int sum = 0;
        int x_2 = 52;
        int sum_2 = 11;

        sum = sum + x;
        System.out.println(sum);

        sum += x;
        System.out.println(sum);

        sum_2 *= x_2;
        System.out.println(sum_2);

        sum_2 /= x;
        System.out.println(sum_2);

        sum_2 -= x;
        System.out.println(sum_2);
    }
}
