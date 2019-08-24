package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex3 {
    @Test
    public void testi() {
        int[][][] a = new int[2][2][2];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));
    }
}
