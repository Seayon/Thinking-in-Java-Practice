package com.seayon.chapter05;

import org.junit.Test;

public class Rock {
    Rock() {
        System.out.println("Rock ");
    }

    Rock(String name) {
        System.out.println("Initialize");
        System.out.println(name);
    }
}
