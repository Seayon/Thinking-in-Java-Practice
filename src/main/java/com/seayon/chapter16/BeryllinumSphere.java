package com.seayon.chapter16;


import java.util.StringJoiner;

public class BeryllinumSphere {
    private static int count = 0;
    private int number;

    public BeryllinumSphere() {
        count++;
        this.number = count;
    }

    public BeryllinumSphere(String name) {
        this.number = count;
        count++;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BeryllinumSphere.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .toString();
    }
}
