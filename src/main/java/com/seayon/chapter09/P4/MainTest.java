package com.seayon.chapter09.P4;

import org.junit.Test;

public class MainTest {
    public static void print(Dad dad) {
        ((Son)dad).print();
    }

    public static void print(Dad2 dad2) {
        dad2.print();
    }
    public static void main(String args[]) {
        print(new Son());
        print(new Son2());
    }


}
