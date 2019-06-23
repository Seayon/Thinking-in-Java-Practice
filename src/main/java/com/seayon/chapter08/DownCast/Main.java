package com.seayon.chapter08.DownCast;

import org.junit.Test;

public class Main {
    @Test
    public void testi() {
        Useful[] x = {new Useful(), new MoreUserful()};
        x[0].f();
        x[1].g();
//        x[1].u();
        ((MoreUserful) x[1]).u();
        ((MoreUserful) x[0]).u();
    }

}
