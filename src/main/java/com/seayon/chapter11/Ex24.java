package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import java.util.*;

public class Ex24 {


    public static void main(String args[]) {
        Map<String, Gerbil> gerbils = new LinkedHashMap<>();
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

        Map<String, Gerbil> gerbilsTemp = new LinkedHashMap<>();

        for (String sortedKey : sortedKeys) {
            Gerbil gerbil = gerbils.get(sortedKey);
            gerbils.remove(sortedKey);
            gerbilsTemp.put(sortedKey, gerbil);
        }
        TreeSet<String> strings = new TreeSet<>(gerbilsTemp.keySet());
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            gerbils.put(next, gerbilsTemp.get(next));
            gerbilsTemp.remove(next);
        }
        System.out.println(gerbilsTemp);
        System.out.println("gerbils = " + gerbils);

        Map<String,Integer> m =
                new LinkedHashMap<String,Integer>();
        m.put("ten", 10);
        m.put("nine", 9);
        m.put("eight", 8);
        m.put("seven", 7);
        m.put("six", 6);
        m.put("five", 5);
        m.put("four", 4);
        m.put("three", 3);
        m.put("two", 2);
        m.put("one", 1);
        m.put("zero", 0);
        System.out.println("Map to sort: " + m);
        // temporary map to hold entrys:
        Map<String,Integer> mTemp =
                new LinkedHashMap<String,Integer>();
        // use TreeSet to sort the keySet():
        Set<String> ss = new TreeSet<String>(m.keySet());
        // mover sorted keys to temp map:
        Iterator<String> itss = ss.iterator();
        while(itss.hasNext()) {
            String s = (String)itss.next();
            Integer i = m.get(s);
            m.remove(s);
            mTemp.put(s, i);
        }
        // get sorted list of temp keys:
        Set<String> ssTemp =
                new TreeSet<String>(mTemp.keySet());
        // move sorted entrys back to map:
        Iterator<String> itssTemp = ssTemp.iterator();
        while(itssTemp.hasNext()) {
            String s = (String)itssTemp.next();
            Integer i = mTemp.get(s);
            mTemp.remove(s);
            m.put(s, i);
        }
        // done with temp:
        mTemp.clear();
        System.out.println("Sorted map: " + m);
    }
}