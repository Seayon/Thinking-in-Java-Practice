package com.seayon.chapter11;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/4 11:12
 * @Description
 */
// holding/Vowels16.java
// TIJ4 Chapter Holding, Exercise 16, page 419
/* Create a Set of the vowels. Working from UniqueWords.java, count and
 * display the number of vowels in each input word, and also display the total
 * number of vowels in the input file.
 */

import net.mindview.util.TextFile;

import java.util.*;


public class Ex23 {
    private static int getBestInt20(int n) {
        Random rand = new Random();
        Map<Integer, Integer> m =
                new TreeMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        int max = 0;
        for(int i = 0; i < m.keySet().size(); i++) {
            max = max < m.get(i) ? m.get(i) : max;
        }
        Set<Map.Entry<Integer,Integer>> me = new
                LinkedHashSet<Map.Entry<Integer,Integer>>(m.entrySet());
        int maxKey = 0;
        Iterator<Map.Entry<Integer,Integer>> it = me.iterator();
        while(it.hasNext()) {
            Map.Entry<Integer,Integer> findMax = it.next();
            if(findMax.getValue() == max)
                maxKey = findMax.getKey();
        }
        return maxKey;
    }
    public static void main(String[] args) {
        Map<Integer,Integer> m20 =
                new TreeMap<Integer,Integer>();
        for(int i = 0; i < 2000; i++) {
            int x = getBestInt20(10000);
            Integer freq = m20.get(x);
            m20.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println("Most often picked ints, 0 - 19, in 2000 tests of 10,000 random picks: " + m20);
    }
}
