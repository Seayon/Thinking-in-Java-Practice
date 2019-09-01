package com.seayon.chapter16;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/9/1 18:28
 *
 * @Description
 */
public class Ex20 {
    public static void main(String[] args){
        int[][] ints1 = new int[2][2];
        int[][] ints2 = new int[2][2];
        Arrays.fill(ints1, new int[2]);
        Arrays.fill(ints2, new int[2]);
        System.out.println("Arrays.equals(ints1,ints2) = " + Arrays.equals(ints1, ints2));
        System.out.println("Arrays.deepEquals(ints1,ints2) = " + Arrays.deepEquals(ints1, ints2));

        int[][][] a1 = new int[4][3][2];
        int[][][] a2 = new int[4][3][2];
        System.out.println((Arrays.deepToString(a1)));
        System.out.println((Arrays.deepEquals(a1, a2)));
        Ex5.A[][][] aa1 = new Ex5.A[4][3][2];
        Ex5.A[][][] aa2 = new Ex5.A[4][3][2];
        System.out.println((Arrays.deepToString(aa1)));
        System.out.println((Arrays.deepEquals(aa1, aa2)));
        System.out.println((Arrays.deepEquals(a1, aa1)));
    }
}
