package com.seayon.chapter19;


import net.mindview.util.Generator;

public class EnumImplementation {
    public static <T> void printNext(Generator<T> arg) {
        System.out.println(arg.next() + ",");
    }

    public static void main(String[] args) {
        CartoonCharacter cartoonCharacter = CartoonCharacter.BOB;
        for (int i = 0; i < 3; i++) {
            printNext(cartoonCharacter);
        }
    }
}
