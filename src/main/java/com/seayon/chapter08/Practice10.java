package com.seayon.chapter08;

import org.junit.Test;

public class Practice10 {
    class One {
        void method1() {
            System.out.println("method1");
            method2();
        }

        void method2() {
            System.out.println("method2");
        }
    }

    class Two extends One{

        @Override
        void method2() {
            System.out.println("Two's method2");
        }
    }

    @Test
    public void testMain() {
        One one = new Two();
        one.method1();

    }

    @Test
    public void testMinus() {
        int i = 1;
        System.out.println((i--));
        System.out.println((i));
        System.out.println(--i);
    }
}
