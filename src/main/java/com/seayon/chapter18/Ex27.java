package com.seayon.chapter18;

import java.io.*;
import java.util.StringJoiner;

public class Ex27 implements Serializable {
    String name;
    int n;
    Ex27_1 ex27_1;

    public Ex27(String name, int n, Ex27_1 ex27_1) {
        this.name = name;
        this.n = n;
        this.ex27_1 = ex27_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Ex27_1 getEx27_1() {
        return ex27_1;
    }

    public void setEx27_1(Ex27_1 ex27_1) {
        this.ex27_1 = ex27_1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Ex27 ex27 = new Ex27("Seayon", 25, new Ex27_1("Seayon阿阳"));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/seayon/IdeaProjects/Thinking-in-Java-Practice/src/main/java/com/seayon/chapter18/Ex27.out"));
        objectOutputStream.writeObject("Ex27 storage\n");
        objectOutputStream.writeObject(ex27);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/seayon/IdeaProjects/Thinking-in-Java-Practice/src/main/java/com/seayon/chapter18/Ex27.out"));
        String s = (String) objectInputStream.readObject();
        Ex27 ex272 = (Ex27) objectInputStream.readObject();
        System.out.println(s + "w2=" + ex272);
        ex272.setN(3);
        System.out.println(s + "w2=" + ex272);


    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ex27.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("n=" + n)
                .add("ex27_1=" + ex27_1.toString())
                .toString();
    }
}
