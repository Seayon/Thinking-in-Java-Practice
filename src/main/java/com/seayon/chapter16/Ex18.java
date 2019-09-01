package com.seayon.chapter16;

import java.util.Arrays;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/9/1 18:06
 * @Description
 */
public class Ex18 {
    public static void main(String[] args){
        BerylliumSphere[]  berylliumSpheres = new BerylliumSphere[10];
        Arrays.fill(berylliumSpheres,new BerylliumSphere("name"));
        System.out.println("Arrays.toString(berylliumSpheres) = " + Arrays.toString(berylliumSpheres));
        BerylliumSphere[] berylliumSpheres1 = new BerylliumSphere[5];
        Arrays.fill(berylliumSpheres1,new BerylliumSphere("name1"));
        System.out.println("Arrays.toString(berylliumSpheres1) = " + Arrays.toString(berylliumSpheres1));
        System.arraycopy(berylliumSpheres,0,berylliumSpheres1,2,3);
        System.out.println("Arrays.toString(berylliumSpheres1) = " + Arrays.toString(berylliumSpheres1));
        BerylliumSphere berylliumSphere = berylliumSpheres1[0];
        berylliumSphere.setName("name3");
        System.out.println("Arrays.toString(berylliumSpheres1) = " + Arrays.toString(berylliumSpheres1));

    }
}
