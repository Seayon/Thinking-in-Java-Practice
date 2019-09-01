package com.seayon.chapter16;

import net.mindview.util.CountingGenerator;

public class Ex13 {
    public static void main(String[] args) {
        CountingGenerator.Character character = new CountingGenerator.Character();
        char[] chars = new char[10];
        for (int i = 0; i < 10; i++) {
            chars[i] = character.next();
        }
        System.out.println(new String(chars));
    }
}
