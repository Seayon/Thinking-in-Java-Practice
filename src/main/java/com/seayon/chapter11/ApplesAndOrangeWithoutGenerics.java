package com.seayon.chapter11;

import java.util.ArrayList;

public class ApplesAndOrangeWithoutGenerics {
    public static void main(String args[]){
        ArrayList objects = new ArrayList();
        for (int i = 0; i < 3; i++) {
            objects.add(new Object());
        }
    }
}
