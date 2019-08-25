package com.seayon.chapter16;

class Peel<T> {
    private static long counter;
    private final long id = counter++;
    private T t;

    public Peel(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Peel " + id + " " + t.toString();
    }
}
