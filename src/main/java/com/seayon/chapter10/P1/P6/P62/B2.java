package com.seayon.chapter10.P1.P6.P62;

import com.seayon.chapter10.P1.P6.P61.A1;

public class B2 {
    protected class B2Inner implements A1 {

        public B2Inner(int x) {

        }

        @Override
        public void f() {
            System.out.println("B2Inner f()");
        }
    }
}
