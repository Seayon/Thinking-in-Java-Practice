package com.seayon.chapter10.P1.P6.P63;

import com.seayon.chapter10.P1.P6.P61.A1;
import com.seayon.chapter10.P1.P6.P62.B2;

public class C3 extends B2 {

    public A1 getA1() {
        return this.new B2Inner(2);
    }
}
