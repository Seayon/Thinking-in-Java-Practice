package com.seayon.chapter16;

import java.util.Arrays;

public class Ex5 {
    //    证明非基本类型的多维数组会被初始化为 null
    public static void main(String[] args) {
        A[][][] a = new A[2][3][4];
        System.out.println(Arrays.deepToString(a));
    }

    class A {
    }
}
