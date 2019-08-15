package com.seayon.chapter15;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/10 12:49
 * @Description
 */
@SuppressWarnings("unchecked")
public class ErasureAndinheritance {


    public static void main(String args[]){
        Derived2 derived2 = new Derived2("2");
        Object object = derived2.get();
        derived2.set(object);
        Derived1<Object> objectDerived1 = new Derived1<>();
        Derived2[] d = (Derived2[]) Array.newInstance(Derived2.class, 20);
        System.out.println("o = " + Arrays.toString(d));
    }

}
class GenericBase<T> {
    private T element;
    public void set(T arg) {
        arg = element;
    }

    public T get() {
        return element;
    }
}
class Derived1<T> extends GenericBase<T>{}

class Derived2 extends GenericBase{
    private String name;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Derived2{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Derived2(String name) {
        this.name = name;
    }
}