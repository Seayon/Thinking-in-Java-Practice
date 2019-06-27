package com.seayon.chapter10.P1;

public class Outer {

    public Inner getIner() {
        return new Inner();
    }

    class Inner {
        class InnerInner{

        }

        public InnerInner getInnerInner() {
            return new InnerInner();
        }
    }

    public static void main(String args[]){
        Outer outer = new Outer();
        Inner.InnerInner innerInner = outer.getIner().getInnerInner();
        System.out.println(innerInner.hashCode());
    }
}
