package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex17 {


    public static void main(String args[]) {
        HashMap<String, Gerbil> stringGerbilHashMap = new HashMap<>();
        stringGerbilHashMap.put("Arya1", new Gerbil(1));
        stringGerbilHashMap.put("Arya2", new Gerbil(2));
        stringGerbilHashMap.put("Arya3", new Gerbil(3));
        Iterator<String> iterator = stringGerbilHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("key = " + key);
            stringGerbilHashMap.get(key).hop();

        }
    }
}
