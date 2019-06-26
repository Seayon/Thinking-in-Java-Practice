package com.seayon.chapter09.P12;

public class Main {
    public static void t(Base.CanFight x) {
        x.fight();
    }

    public static void u(Base.CanSwim x) {
        x.swim();
    }

    public static void v(Base.CanFly x) {
        x.fly();
    }

    public static void c(Base.CanClimb x) {
        x.climb();
    }

    public static void w(Base.ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
/*        Base.Hero h = new Base.Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        c(h); // Treat it as a CanClimb
        w(h); // Treat it as an ActionCharacter*/
        int i = 1;
        System.out.println(++i != 1);
        System.out.println(i);
        System.out.println(i++);
        System.out.println(++i);

    }
}
