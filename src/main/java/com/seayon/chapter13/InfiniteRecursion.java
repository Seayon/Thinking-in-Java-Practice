package com.seayon.chapter13;

import net.mindview.util.RandomGenerator;

import java.util.ArrayList;

public class InfiniteRecursion {
    @Override
    public String toString() {
        return "InfiniteRecursion address:" + super.toString() + "\n";
    }

    public static void main(String args[]){
        ArrayList<InfiniteRecursion> infiniteRecursions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            infiniteRecursions.add(new InfiniteRecursion());
        }
        System.out.println(infiniteRecursions);
        String s = new String();
    }
}
