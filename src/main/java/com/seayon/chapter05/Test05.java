package com.seayon.chapter05;

import org.junit.Test;

public class Test05 {
    @Test
    public void testRock() {
        for (int i = 0; i < 100; i++) {
            new Rock();
        }
    }

    @Test
    public void testStringRock() {
        StringRock stringRock = new StringRock();
        System.out.println(stringRock.a == null);
    }

    @Test
    public void testLeafThis() {
        Leaf leaf = new Leaf();
        System.out.println(leaf.increment().increment().increment().increment().i);
    }

    @Test
    public void testApple() throws Throwable {
        Apple apple = new Apple();
        apple.testt();
        apple.finalize();
        apple = null;
        new Apple();
        System.gc();
    }
}
