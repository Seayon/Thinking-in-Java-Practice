package com.seayon.chapter05;

import org.junit.Test;

import static net.mindview.util.Print.*;

import java.util.Arrays;
import java.util.Random;

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

    @Test
    public void testLocalInit() {
        int i;
//        i++; doesn't work
    }

    @Test
    public void testArray1() {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a2[i] + 1;
        }
        for (int i : a1) {
            System.out.println(i);
        }
    }

    @Test
    public void testArrayNew() {
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        print("length = " + a.length);
        print(Arrays.toString(a));
    }

    @Test
    public void testArrayInteger() {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println("length" + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void testArrayInit() {
        Integer[] a = {new Integer(1), new Integer(2), 3,};
        Integer[] b = new Integer[]{new Integer(1), new Integer(2), 3};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    @Test
    public void testPractice17() {
        Rock[] rocks = new Rock[20];
//        rocks[0] = new Rock("2");
    }

    static void f(int required, String    ...  trailing) {
        System.out.println("required" + required + " ");
        for (String s : trailing) {
            System.out.println(s + " ");
        }
    }
    @Test
    public void testStringTrailing() {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }

    @Test
    public void testArgs() {
//        VarargType.f('a');
//        VarargType.f();
//        VarargType.g(1);
//        VarargType.g();
    }
   @Test
   public void testCompileTimeError() {

   }

   @Test
   public void testEnum() {
       for (Spiciness value : Spiciness.values()) {
           System.out.println("value = " + value);
           System.out.println("value.ordinal() = " + value.ordinal());
       }

       Burrito
               plain = new Burrito(Spiciness.FLAMING),
               greenChile = new Burrito(Spiciness.FLAMING);
   }

}