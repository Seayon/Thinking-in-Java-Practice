package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import java.util.*;

public class Ex19 {


    public static void main(String args[]) {
        HashMap<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("Standlord", new Gerbil(1));
        gerbils.put("Spot", new Gerbil(2));
        gerbils.put("Speedy", new Gerbil(3));
        gerbils.put("Dopey", new Gerbil(4));
        gerbils.put("Sleepy", new Gerbil(5));
        gerbils.put("Happy", new Gerbil(6));
        System.out.println("gerbils = " + gerbils);
        System.out.println();
        HashSet<String> hashSetKeys = new HashSet<>(gerbils.keySet());
        System.out.println("hashSetKeys = " + hashSetKeys);
        System.out.println();
        Map<String, Gerbil> hashedGerbils =
                new LinkedHashMap<String, Gerbil>();
        for (String s : hashSetKeys) {
            System.out.print("Adding " + s + ", ");
            hashedGerbils.put(s, gerbils.get(s));
        }

        System.out.println("hashedGerbils = " + hashedGerbils);

        LinkedHashSet<String> linkedHashSetKeys = new LinkedHashSet<>(gerbils.keySet());
        System.out.println("linkedHashSetKeys = " + linkedHashSetKeys);

        Map<String, Gerbil> linkedHashedGerbils =
                new LinkedHashMap<String, Gerbil>();
        for (String s : linkedHashSetKeys) {
            System.out.print("Adding " + s + ", ");
            linkedHashedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println();
        System.out.println("From LinkedHashSet: "
                + linkedHashedGerbils);
    }


}
