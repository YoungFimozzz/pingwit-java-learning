package com.pingwit.part_1;

public class TypeCastingExample {
    public static void main(String[] args) {
        // повышение типов
        byte smallerByte = 127;
        int biggerInt = smallerByte;
        System.out.println(biggerInt);

        double intDouble = biggerInt;
        System.out.println(intDouble);

        // понижение типов
        int highInt = 200;
        byte smallByte = (byte) highInt;
        System.out.println(smallByte);
        /*
        byte 2^8=256 -128 +127 -> 200-256 = -56
        if int = 400  400-256 = 144 = 144 - 256 = -112
         */

        double highDouble = 100.9;
        highInt = (int) highDouble;
        System.out.println(highInt);
    }
}
