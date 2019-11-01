package com.seayon.chapter19;

import java.util.Arrays;
import java.util.EnumSet;

public class EnumClass {
    public static void main(String[] args) {
        EnumSet<Shrubbery> enumSet = EnumSet.of(Shrubbery.CRAWLING);
        boolean x = enumSet.removeAll(EnumSet.allOf(Shrubbery.class));
        System.out.println(enumSet);

        for (Shrubbery value : Shrubbery.values()) {
            System.out.println(value.getInfo());
        }
        Shrubbery crawling = Shrubbery.CRAWLING;
        System.out.println("Shrubbery.CRAWLING.name() = " + Shrubbery.CRAWLING.name());
        System.out.println("Shrubbery.valueOf(\"CRAWLING\") = " + Shrubbery.valueOf("CRAWLING"));
        System.out.println("Arrays.deepToString(Shrubbery.values()) = " + Arrays.deepToString(Shrubbery.values()));

        for (Shrubbery value : Shrubbery.values()) {
            System.out.println(value + " original：" + value.ordinal());
            System.out.println(value.compareTo(Shrubbery.CRAWLING));
            System.out.println(value.compareTo(Shrubbery.HANGING));
            System.out.println(value == Shrubbery.CRAWLING);
            System.out.println(value.getDeclaringClass());
            System.out.println(value.name());
        }
        System.out.println(Shrubbery.CRAWLING.name());
        for (String s : "HANGING GROUND CRAWLING NONE".split(" ")) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrubbery);
        }
    }
}
