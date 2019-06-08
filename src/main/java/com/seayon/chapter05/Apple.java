package com.seayon.chapter05;

import org.junit.Test;

public class Apple {
    public void t() {
        System.out.println("t");
    }

    public void testt() {
        t();
        this.t();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I was finalize");
        super.finalize();
    }
}
