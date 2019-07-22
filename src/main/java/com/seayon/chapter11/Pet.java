package com.seayon.chapter11;

public class Pet {
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                '}';
    }

    int id;

    public Pet(int id) {
        this.id = id;
    }

    int id() {
        return this.id;
    }
}
