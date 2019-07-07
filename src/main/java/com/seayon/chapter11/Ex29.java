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

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

class A extends Object{
    int  a = new Random().nextInt(100);
}
public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue<A> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new A());
        priorityQueue.offer(new A());//从第二个就添加不进去了
        priorityQueue.offer(new A());
        priorityQueue.offer(new A());
        priorityQueue.offer(new A());
        System.out.println(priorityQueue.size());

    }
}
