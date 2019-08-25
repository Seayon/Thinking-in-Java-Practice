package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex6 {

    public BerylliumSphere[][] testTwo(int size1, int size2) {

        BerylliumSphere[][] berylliumSpheres = new BerylliumSphere[size1][size2];
        for (int i = 0; i < berylliumSpheres.length; i++) {
            BerylliumSphere[] berylliumSphere = berylliumSpheres[i];
            for (int j = 0; j < berylliumSphere.length; j++) {
                berylliumSpheres[i][j] = new BerylliumSphere();
            }
        }
        return berylliumSpheres;
    }

    @Test
    public void testi() {
        BerylliumSphere[][] berylliumSpheres = testTwo(2, 3);
        System.out.println(Arrays.deepToString(berylliumSpheres));
    }
}
