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

public class Ex25 {
    static void vowelCounter(List st) {
        HashMap<String, ArrayList<Integer>> stringArrayListHashMap = new HashMap<>();
        Iterator<String> iterator = st.iterator();
        HashMap<String, Integer> counter = new HashMap<>();
        int i = 1;
        while (iterator.hasNext()) {

            String next = iterator.next();
            //ArrayList<Integer> integers = stringArrayListHashMap.get(next) == null ? new ArrayList<>() : stringArrayListHashMap.get(next);
            //integers.add(i);
            //stringArrayListHashMap.put(next, integers);
            counter.put(next, counter.get(next) == null ? 1 : counter.get(next)+1);
            i++;
        }
        System.out.println("counter = " + counter);
        System.out.println("stringArrayListHashMap = " + stringArrayListHashMap);
    }

    public static void main(String[] args) {
        ArrayList<String> myWords = new ArrayList<>();
        TextFile c = new TextFile("SetOperations.java", "\\W+");
        myWords.addAll(c);

        System.out.println(myWords);
        System.out.println();
        vowelCounter(myWords);


        Map<String,ArrayList<Integer>> m =
                new LinkedHashMap<String,ArrayList<Integer>>();
        List<String> words = new LinkedList<String>();
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        System.out.println("Words in file: " + words);
        Iterator itWords = words.iterator();
        int count = 0;
        while(itWords.hasNext()) {
            String s = (String)itWords.next();
            count++;
            if(!m.keySet().contains(s)) {
                ArrayList<Integer> ai =
                        new ArrayList<Integer>();
                ai.add(0, count);
                m.put(s, ai);
            }
            else {
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
        }
        System.out.println("Map of word locations: " + m);
    }
}
