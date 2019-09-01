package com.seayon.chapter16;

import net.mindview.util.CountingGenerator;

import java.util.Arrays;

public class Ex12 {
    public static void main(String[] args) {
        CountingGenerator.Double d = new CountingGenerator.Double();
        double[] doubles = new double[100];
        for (int i = 0; i < 100; i++) {
            doubles[i] = d.next();
        }
        System.out.println("Arrays.toString(doubles) = " + Arrays.toString(doubles));
    }
}
