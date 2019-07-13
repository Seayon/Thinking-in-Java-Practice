package com.seayon.chapter13;

import java.util.regex.Pattern;

public class Ex7 {
    public static void main(String args[]){
        String startWithUpperCase = new String("^[A-Z].*\\.$");
        System.out.println("\"123\".matches(\"\") = " + "A123.".matches(startWithUpperCase));
        System.out.println("\"B123\".matches(startWithUpperCase) = " + "B123".matches(startWithUpperCase));
        System.out.println("\"c123\".matches(startWithUpperCase) = " + "c123".matches(startWithUpperCase));
    }
}
