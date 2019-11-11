package com.seayon.chapter21;

public class TestChapter21 {
    public static void main(String args[]) {

        LiftOff m = new LiftOff("M");
        Thread t1 = new Thread(m.new Ex1RunnerA());
        Thread t2 = new Thread(m.new Ex1RunnerB());
        Thread t3 = new Thread(m.new Ex1RunnerC());
        t1.start();
        t2.start();
        t3.start();

    }
}
