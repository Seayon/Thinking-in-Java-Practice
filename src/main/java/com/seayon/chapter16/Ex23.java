package com.seayon.chapter16;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/9/1 23:31
 * @Description
 */
public class Ex23 {
    public static void main(String[] args){
        Integer[] integers = Generated.array(new Integer[20], new RandomGenerator.Integer(10));
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));
        Arrays.sort(integers,Collections.reverseOrder());
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

    }
}
