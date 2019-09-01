package com.seayon.chapter16;

import net.mindview.util.CountingGenerator;

import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        double[] doubles = new double[10];
        char[] chars = new char[10];
        boolean[] booleans = new boolean[10];
        CountingGenerator.Integer integer = new CountingGenerator.Integer();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = integer.next();
        }
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        CountingGenerator.Double aDouble = new CountingGenerator.Double();
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = aDouble.next();
        }
        System.out.println("Arrays.toString(doubles) = " + Arrays.toString(doubles));

    }
}
