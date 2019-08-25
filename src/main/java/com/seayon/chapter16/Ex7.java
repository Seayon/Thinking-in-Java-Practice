package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex7 {

    public BerylliumSphere[][][] testTwo(int size1, int size2, int size3) {

        BerylliumSphere[][][] berylliumSpheres = new BerylliumSphere[size1][size2][size3];
        for (int i = 0; i < berylliumSpheres.length; i++) {
            BerylliumSphere[][] berylliumSphere = berylliumSpheres[i];
            for (int j = 0; j < berylliumSphere.length; j++) {
                for (int k = 0; k < berylliumSpheres[i][j].length; k++) {
                    berylliumSpheres[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return berylliumSpheres;
    }

    @Test
    public void testi() {
        System.out.println(Arrays.deepToString(testTwo(2, 4, 3)));
    }
}
