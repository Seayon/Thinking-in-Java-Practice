package com.seayon.chapter15;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/10 23:55
 * @Description
 */
// generics/ClassTypeCapture24.java
// TIJ4 Chapter Generics, Exercise 24, page 667
// Modify Exercise 21 so that factory objects are held in the Map instead of Class<?>.

import com.sun.corba.se.pept.transport.Selector;

import java.util.*;

import static com.seayon.utils.MyPrint.println;
import static net.mindview.util.Print.print;

interface Factory<T> {
    T create();
}


class BuildingFactory implements Factory<Building> {
    public Building create() {
        return new Building();
    }
}

class HouseFactory implements Factory<House> {
    public House create() {
        return new House();
    }
}

public class ClassTypeCapture24<T> {
    Class<?> kind;

    public ClassTypeCapture24(Class<?> kind) {
        this.kind = kind;
    }

    Map<String, Factory> map;

    public ClassTypeCapture24(Class<?> kind, Map<String, Factory> map) {
        this.kind = kind;
        this.map = map;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typename, Factory factory) {
        map.put(typename, factory);
    }

    public Object createNew(String typename)
            throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typename))
            return map.get(typename).create();
        System.out.println(typename + " class not available");
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCapture24<Building> ctt1 =
                new ClassTypeCapture24<Building>(Building.class);
        println(ctt1.f(new Building()));
        println(ctt1.f(new House()));
        ClassTypeCapture24<House> ctt2 =
                new ClassTypeCapture24<House>(House.class);
        println(ctt2.f(new Building()));
        println(ctt2.f(new House()));
        ClassTypeCapture24<Building> ct =
                new ClassTypeCapture24<Building>(
                        Building.class, new HashMap<String, Factory>());
        ct.addType("House", new HouseFactory());
        ct.addType("Building", new BuildingFactory());
        println("ct.map = " + ct.map);
        try {
            Building b = (Building) ct.createNew("Building");
            House h = (House) ct.createNew("House");
            print("b.getClass().getName(): ");
            println(b.getClass().getName());
            print("h.getClass().getName(): ");
            println(h.getClass().getName());
            print("House h is instance House: ");
            println(h instanceof House);
            print("House h is instance of Building: ");
            println(h instanceof Building);
            print("Building b is instance of House: ");
            println(b instanceof House);
            ct.createNew("String");  // String class not available
        } catch (IllegalAccessException e) {
            println("IllegalAccessException in main");
        } catch (InstantiationException e) {
            println("InstantiationException in main");
        }
    }

    //继承一个类的同时实现多个接口
    class A<T extends ClassTypeCapture24 & Selector & A24> {

    }

    interface A24 {

    }

    ;


}
