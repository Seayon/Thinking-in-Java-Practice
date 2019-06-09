package com.seayon.chapter05;

public class VarargType {
    static void f(Character... args) {
        System.out.println(args.getClass());
        System.out.println("args.length = " + args.length);
    }

    static void g(int... args) {
        System.out.println(args.getClass());
        System.out.println("args.length = " + args.length);
    }

    static void f(float i, Character... args) {
        System.out.println(args.getClass());
        System.out.println("args.length = " + args.length);
    }
}
