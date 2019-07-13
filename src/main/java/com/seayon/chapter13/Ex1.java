package com.seayon.chapter13;

import org.junit.Test;

public class Ex1 {
    public static void main(String args[]) {
        int i = 0;

    }

    @Test
    public void testi() {
        int i = 1;
        int add = add(i);
        System.out.println("add = " + add);
        System.out.println("i = " + i);

    }

    public int add(int i) {
        i =i+3;
        return i;
    }


    @Test
    public void testOv() {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }
}
