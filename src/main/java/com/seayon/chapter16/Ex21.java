package com.seayon.chapter16;

import java.util.Arrays;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/9/1 18:06
 * @Description
 */
public class Ex21 {
    public static void main(String[] args){
        BerylliumSphere[]  berylliumSpheres = new BerylliumSphere[10];
        for (int i = 10; i > 0; i--) {
            berylliumSpheres[i-1] = new BerylliumSphere("name" + i);
        }

        System.out.println(Arrays.toString(berylliumSpheres));
        Arrays.sort(berylliumSpheres);
        System.out.println(Arrays.toString(berylliumSpheres));

    }
}
