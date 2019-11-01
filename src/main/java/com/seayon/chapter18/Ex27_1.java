package com.seayon.chapter18;

import java.io.Serializable;
import java.util.StringJoiner;

public class Ex27_1 implements Serializable {
    String nickName;

    public Ex27_1(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ex27_1.class.getSimpleName() + "[", "]")
                .add("nickName='" + nickName + "'")
                .toString();
    }
}
