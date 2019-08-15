package com.seayon.chapter15;

import java.util.List;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/10 12:23
 * @Description
 */

interface A {
    void f();
    void g();
}

class A3 implements A {
    public void f() { System.out.println("A3.f()"); }
    public void g() { System.out.println("A3.g()"); }
    public void h() { System.out.println("A3.h()"); }
}
class A4 extends A3{

}

class G {
    public static <T extends A3> void j(T x) {
        x.f();
        x.g();
        x.h();
    }
}

public class Ex20 {
    public static void main(String[] args) {
        A4 a3 = new A4();
        G.j(a3);
    }
}
