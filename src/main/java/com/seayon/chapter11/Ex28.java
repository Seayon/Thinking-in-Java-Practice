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

public class Ex28 {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Random random = new Random(47);
        for (int i = 0; i < 20; i++) {
            priorityQueue.offer(random.nextDouble());
        }

        while (priorityQueue.peek() != null) {
            System.out.println("priorityQueue.poll() = " + priorityQueue.poll());
        }

    }
}
