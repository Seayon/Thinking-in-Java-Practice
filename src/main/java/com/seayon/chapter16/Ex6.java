package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex6 {

    public BeryllinumSphere[][] testTwo(int size1,int size2) {

        BeryllinumSphere[][] beryllinumSpheres = new BeryllinumSphere[size1][size2];
        for (int i = 0; i < beryllinumSpheres.length; i++) {
            BeryllinumSphere[] beryllinumSphere = beryllinumSpheres[i];
            for (int j = 0; j < beryllinumSphere.length; j++) {
                beryllinumSpheres[i][j] = new BeryllinumSphere();
            }
        }
        return beryllinumSpheres;
    }

    @Test
    public void testi() {
        BeryllinumSphere[][] beryllinumSpheres = testTwo(2, 3);
        System.out.println(Arrays.deepToString(beryllinumSpheres));
    }
}
