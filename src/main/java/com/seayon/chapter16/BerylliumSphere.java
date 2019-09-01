package com.seayon.chapter16;


import java.util.StringJoiner;

public class BerylliumSphere implements Comparable<BerylliumSphere> {
    private String name;
    private static int count = 0;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BerylliumSphere.count = count;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BerylliumSphere() {
        count++;
        this.number = count;
    }

    public BerylliumSphere(String name) {
        this.number = count;
        this.name = name;
        count++;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BerylliumSphere{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(BerylliumSphere o) {
        return number < o.number ? -1 : (number == o.number ? 0 : 1);
    }
}
