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

class Command {
    String name;

    public Command(String name) {
        this.name = name;
    }

    void operation() {
        System.out.println("name = " + name);
    }
}

class Send {
    public Queue<Command> queue = new LinkedList<>();

    Command in(Command command) {
        return queue.offer(command) ? command : null;
    }
}

class Recv {
    void out(Queue<Command> queue) {
        Command command;
        while (queue.peek() != null) {
            queue.poll().operation();
        }
    }
}

public class Ex27 {

    public static void main(String[] args) {
        Send send = new Send();
        for (int i = 0; i < 10; i++) {
            send.in(new Command("Commoand:" + i));
        }
        Recv recv = new Recv();
        recv.out(send.queue);
    }
}
