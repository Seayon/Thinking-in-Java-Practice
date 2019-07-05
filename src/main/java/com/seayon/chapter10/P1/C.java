package com.seayon.chapter10.P1;

import com.seayon.chapter10.P1.P6.P62.B2;

public class C {

    public Destination f2() {
        if (true) {
            class Ci implements Destination {

                @Override
                public void f() {

                }
            }
            return new Ci();
        }
        return null;

    }


    public B2 get(final String param) {
        return new B2() {
            private String desc = param;

        };
    }


    private class Ex11Inner implements Destination {

        @Override
        public void f() {

        }

        public Destination g() {
            return new Destination() {
                @Override
                public void f() {
                    System.out.println("my destination");
                }

                int i = 1;
                Outer outer = new Outer();
            };
        }


    }
}
