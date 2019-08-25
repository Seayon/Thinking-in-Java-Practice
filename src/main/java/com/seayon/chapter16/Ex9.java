package com.seayon.chapter16;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
// error: generic array creation:
//        Peel<Banana>[] peels = new Peel<Banana>[10];
        Peel<Banana>[] peels;
//        ArrayList<Banana> bananas = new ArrayList<Banana>()[10];

        List<Peel<Banana>> peels1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            peels1.add(new Peel<>(new Banana()));
        }

        System.out.println(peels1);


    }
}
