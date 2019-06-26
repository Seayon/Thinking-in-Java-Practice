package com.seayon.chapter10.P1;

public class Outer {

    public Inner getIner() {
        return new Inner();
    }

    class Inner {

    }

    public static void main(String args[]){
        Outer outer = new Outer();
        Inner iner = outer.getIner();
        System.out.println(iner.hashCode());
    }
}
