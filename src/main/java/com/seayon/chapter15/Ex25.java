package com.seayon.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/11 1:03
 * @Description
 */
interface Ex25iA {

}

interface Ex25iB {
}

class Ex25Test implements Ex25iA, Ex25iB {
    public <T extends Ex25iA> void f1(T t1) {
        System.out.println("t1=" + t1.getClass().getSimpleName());
    }

    public <T extends Ex25iB> void f2(T t2) {
        System.out.println("t2=" + t2.getClass().getSimpleName());
    }
}

public class Ex25 {
    public static void main(String args[]) {
        Ex25Test ex25c1 = new Ex25Test();
        ex25c1.f1(ex25c1);
        ex25c1.f2(ex25c1);
//        List<Fruit> fruits = new ArrayList<Apple>();
        List<? extends Fruit> fruits = new ArrayList<Apple>();
//        fruits.add(new Apple()); doesn't work
// 显示器接口
    }




}
class Fruit{}

class Apple extends Fruit {

}
