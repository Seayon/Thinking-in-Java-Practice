package com.seayon.chapter19;

public enum Input {
    NICKLE(5), DIME(10),STOP{};

    int value;

    Input(int val) {
        this.value = val;
    }

    int amount() {
        return value;
    }

    Input() {

    }
}
