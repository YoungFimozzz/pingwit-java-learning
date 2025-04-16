package com.pingwit.part_1;

public class JavaPrimitivesExample {
    public static void main(String[] args ) {
        /*
        byte 2^8 -> 256 /2 -> -128 + 127
        short 2^16 -> 65536 /2 -> -32768 + 32767
        char 2^16 -> 0 65536
        int 2^32
        long 2^64
         */

        /*
        float -> min=1.4E-45 max=3.4028235E38 -> 1.4*10^-45  3.4.....*10^38
        double -> min=4. 9E-324 max=1.7976931348623157E308
         */

        /*
        boolean -> true/false
         */

        byte myByte = 127;
        System.out.println(myByte);

        int myInt = 128;
        System.out.println(myInt);

       double myDouble = 3.5;
       System.out.println(myDouble);

       char myChar = 1000;
       System.out.println(myChar);

       char myCharSymbol = 'k' ;
       System.out.println(myCharSymbol);

       char myChar2 = '\u98F7';
       System.out.println(myChar2);

       boolean myBoolean = true;
       System.out.println(myBoolean);
    }

}

