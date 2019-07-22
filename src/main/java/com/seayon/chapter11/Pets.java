package com.seayon.chapter11;

public class Pets {
    public static Pet[] createArray(int n) {
        Pet[] pets = new Pet[n];
        for (int i = 0; i < n; i++) {
            pets[i] = new Pet(i);
        }
        return pets;
    }
}
