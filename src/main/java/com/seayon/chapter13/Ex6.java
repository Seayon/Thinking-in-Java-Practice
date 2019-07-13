package com.seayon.chapter13;

import java.util.StringJoiner;

public class Ex6 {
    public static void main(String args[]){
        Ex6I ex6I = new Ex6I();
        System.out.println(ex6I.toString());
    }
}

class Ex6I {
    int a = 2000000000;
    long b = 2000000000;
    float c = 2.4f;
    double d = 2.000;

    @Override
    public String toString() {
        return String.format("i = %d\nl = %d\nf = %2.16g\nd = %.16g\n", a, b, c, d);

//        return String.format("%-15d%-15d%-15f%-15s",a,b,c,d);
//        return new StringJoiner(", ", Ex6I.class.getSimpleName() + "[", "]")
//                .add("a=" + a)
//                .add("b=" + b)
//                .add("c=" + c)
//                .add("d=" + d)
//                .toString();
    }
}
