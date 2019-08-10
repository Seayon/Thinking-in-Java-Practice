package com.seayon.chapter15;

import org.junit.Test;
import sun.nio.cs.ext.IBM037;

import java.util.HashMap;
import java.util.Map;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/10 14:11
 * @Description
 */

public class ClassTypeCapture<T> {

    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    Map<String, Class<?>> map = new HashMap<>();

    public void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }

    public Object createNew(String typename) {
        Class<?> aClass = map.get(typename);
        if (aClass != null) {
            try {
                return aClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("未找到");
        }
        return null;
    }
    public static void main(String args[]){

        ClassTypeCapture<?> classTypeCapture = new ClassTypeCapture<>(String.class);
        classTypeCapture.addType("String", String.class);
        Object string = (String)classTypeCapture.createNew("String");
        System.out.println("string = " + string);

    }

}
