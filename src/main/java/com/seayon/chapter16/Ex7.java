package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex7 {

    public BeryllinumSphere[][][] testTwo(int size1,int size2,int size3) {

        BeryllinumSphere[][][] beryllinumSpheres = new BeryllinumSphere[size1][size2][size3];
        for (int i = 0; i < beryllinumSpheres.length; i++) {
            BeryllinumSphere[][] beryllinumSphere = beryllinumSpheres[i];
            for (int j = 0; j < beryllinumSphere.length; j++) {
                for (int k = 0; k < beryllinumSpheres[i][j].length; k++) {
                    beryllinumSpheres[i][j][k] = new BeryllinumSphere();
                }
            }
        }
        return beryllinumSpheres;
    }

    @Test
    public void testi() {
        System.out.println(Arrays.deepToString(testTwo(1, 2, 3)));
        System.out.println(Arrays.deepToString(testTwo(2, 4, 3)));
    }
}
