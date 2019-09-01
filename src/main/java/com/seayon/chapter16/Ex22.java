package com.seayon.chapter16;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/9/1 23:25
 * @Description
 */
public class Ex22 {
    public static void main(String[] args) {
        int[] primitive = ConvertTo.primitive(Generated.array(new Integer[20], new RandomGenerator.Integer(10)));
        System.out.println("Arrays.toString(primitive) = " + Arrays.toString(primitive));
        System.out.println(Arrays.binarySearch(primitive, 0));
        for (int i = 0; i < 10; i++) {
            int index = Arrays.binarySearch(primitive, i);
            if (index < 0) {
                System.out.println(i + "not found");
            } else {
                System.out.println("Index:" + index);
            }
        }

    }
}
