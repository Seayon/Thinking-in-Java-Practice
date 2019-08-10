package com.seayon.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/11 1:32
 * @Description
 */
// generics/Ex26.java
// TIJ4 Chapter Generics, Exercise 26, page 680
// Demonstrate array covariance using Numbers and Integers.

public class Ex27 {
    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<Integer>();
//        numbers.add(new Integer(1));
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        Number number = numbers.get(0);

        for(Number n : numbers)
            System.out.println(n);
        // compile errors: incompatible types:
        // Integer[] ints = numbers;
        // for(Integer n : numbers)
        //	System.out.println(n);
        // even though runtime type is Integer:
        for(Number n : numbers)
            System.out.println(n.getClass().getSimpleName());
    }
}
