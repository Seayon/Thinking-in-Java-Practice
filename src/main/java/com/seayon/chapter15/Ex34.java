package com.seayon.chapter15;

import org.junit.Test;

public class Ex34 {
    abstract class SelfType <T extends SelfType<T>>{
        abstract T f(T t);

        T f2(T t) {
            System.out.println("SelftType:f2");
            return f(t);
        }
    }

    class SelfTypeDerived extends SelfType<SelfTypeDerived> {
        @Override
        SelfTypeDerived f(SelfTypeDerived selfTypeDerived) {
            System.out.println("SelfTYpeDerived:f2");
            System.out.println("selfTypeDerived = " + selfTypeDerived);
            return selfTypeDerived;
        }
    }
    @Test
    public void testi() {
        SelfTypeDerived selfTypeDerived = new SelfTypeDerived();
        selfTypeDerived.f(selfTypeDerived).f2(selfTypeDerived);
    }
}
