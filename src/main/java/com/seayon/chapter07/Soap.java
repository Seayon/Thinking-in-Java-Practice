package com.seayon.chapter07;

import static net.mindview.util.Print.print;

public class Soap {
    private String s;
    Soap() {
        print("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
