package com.seayon.chapter16;

import java.util.Arrays;

public class Ex8<T> {
    //Must converts Object[] to T[]
    @SuppressWarnings("unchecked")
    T[] ts = (T[]) new Object[2];

    public static void main(String[] args) {
        String[] sa = new String[32];
        sa[0] = "0";
        sa[1] = "1";
        Object[] objects = new Object[32];
        objects[0] = new StringBuffer("2");
        objects[1] = new BerylliumSphere();
        objects[2] = 2;//Autoboxing converts int to Integer
        System.out.println(objects[2].getClass().getSimpleName());
        System.out.println(Arrays.toString(objects));
        objects = sa;
        //compiles ok,but Runtime ArrayStoreException
        objects[3] = new StringBuffer();
    }
}
