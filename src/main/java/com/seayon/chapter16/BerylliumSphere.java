package com.seayon.chapter16;


import java.util.StringJoiner;

public class BerylliumSphere {
    private static int count = 0;
    private int number;

    public BerylliumSphere() {
        count++;
        this.number = count;
    }

    public BerylliumSphere(String name) {
        this.number = count;
        count++;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BerylliumSphere.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .toString();
    }
}
