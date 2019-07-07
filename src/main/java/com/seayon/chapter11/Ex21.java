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

public class Ex21 {


    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(
                new TextFile("SetOperations.java", "\\W+"));
        System.out.println("Words to count: " + words);
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String,Integer> wordCount =
                new LinkedHashMap<String,Integer>();
        Iterator it = words.iterator();
        int totalWords = 0;
        while(it.hasNext()) {
            String s = (String)it.next();
            if(words.contains(s)) {
                Integer count = wordCount.get(s);
                wordCount.put(s,
                        count == null ? 1 : count + 1);
                totalWords++;
            }
        }
        System.out.println();
        System.out.println("Word count: " + wordCount);
        System.out.println();
        System.out.println("Total words: " + totalWords);
    }
}
