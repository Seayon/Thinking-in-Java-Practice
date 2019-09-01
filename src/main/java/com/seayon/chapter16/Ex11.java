package com.seayon.chapter16;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        integers[2] = new Integer(2);
        integers[3] = 1;
        int[] ints = new int[3];
        ints[0] = new Integer(2);
        ints[1] = new Integer(3);
        System.out.println("integers = " + Arrays.toString(integers));
        System.out.println("ints = " + Arrays.toString(ints));

        //integers = ints;//AutoBoxing doesn't work here
        Arrays.copyOf(integers, 10);
        int i = Arrays.binarySearch(ints, 2);
        System.out.println(i);
    }
}
