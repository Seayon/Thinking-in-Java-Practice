package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex2 {
    public BerylliumSphere[] arrayReturn(int i) {
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[i];
        for (int j = 0; j < berylliumSpheres.length; j++) {
            berylliumSpheres[j] = new BerylliumSphere();
        }
        return berylliumSpheres;
    }

    @Test
    public void testi() {
        System.out.println(Arrays.toString(arrayReturn(5)));
    }

    @Test
    public void test2() {
        printArray(arrayFactory(5, 6, 7, 2, 5));
    }

    public void printArray(double[][][] doubles) {
        System.out.println(Arrays.deepToString(doubles));
//        for (int i = 0; i < doubles.length; i++) {
//            double[] doubles1 = doubles[i];
//            for (int j = 0; j < doubles1.length; j++) {
//                System.out.println(doubles[i][j]);
//            }
//        }
    }

    public double[][][] arrayFactory(int size1, int size2, int size3, double start, double end) {
        double[][][] doubles = new double[size1][size2][size3];
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                for (int k = 0; k < doubles[i][j].length; k++) {
                    doubles[i][j][k] = (start + ((double) k / (size3 - 1)) * (end - start));
                }
            }
        }
        return doubles;
    }
}
