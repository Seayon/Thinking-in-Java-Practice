package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import java.util.*;

public class Ex18 {


    public static void main(String args[]) {
        HashMap<String, Gerbil> map = new HashMap<>();
        map.put("Standlord", new Gerbil(1));
        map.put("Spot", new Gerbil(2));
        map.put("Speedy", new Gerbil(3));
        map.put("Dopey", new Gerbil(4));
        map.put("Sleepy", new Gerbil(5));
        map.put("Happy", new Gerbil(6));
        System.out.println("map = " + map);
        Set<String> strings = new TreeSet<String>(map.keySet());
        System.out.println("strings = " + strings);
//        for (String string : strings) {
//            System.out.println("string = " + string);
//            System.out.println("string.hashCode() = " + string.hashCode());
//            System.out.println("map.get(string) = " + map.get(string));
//        }


        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        gerbils.put("Sleepy", new Gerbil(4));
        gerbils.put("Happy", new Gerbil(5));
        gerbils.put("Funny", new Gerbil(6));
        gerbils.put("Silly", new Gerbil(7));
        gerbils.put("Goofy", new Gerbil(8));
        gerbils.put("Wowee", new Gerbil(9));
        System.out.println(gerbils);
        System.out.println();
        Set<String> sortedKeys =
                new TreeSet<String>(gerbils.keySet());
        System.out.println(sortedKeys);
        System.out.println();
        Map<String, Gerbil> sortedGerbils =
                new LinkedHashMap<String, Gerbil>();
        for(String s : sortedKeys) {
            System.out.print("Adding " + s + ", ");
            sortedGerbils.put(s, gerbils.get(s));
        }
        System.out.println();
        System.out.println();
        System.out.println(sortedGerbils);
        System.out.println();
        // or, just:
        Map<String, Gerbil> sortedGerbils2 =
                new TreeMap<String, Gerbil>(gerbils);
        System.out.println(sortedGerbils2);
    }
}