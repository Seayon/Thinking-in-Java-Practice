package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        BerylliumSphere[] a;
        BerylliumSphere[] b = new BerylliumSphere[5];
        BerylliumSphere[] d = {};
        BerylliumSphere[] c = {new BerylliumSphere("a"), new BerylliumSphere("b")};//普通的聚集初始化的语法创建
//        a = {new BerylliumSphere()};  //聚集初始化必须在定义的位置用,上述 c这里这种写法行不通
        a = new BerylliumSphere[]{new BerylliumSphere()};
//        动态的聚集初始化,不受必须在定义时使用的限制,不管是在定义时使用还是定义以后再用都可以
        BerylliumSphere[] e = new BerylliumSphere[]{new BerylliumSphere()};
        a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};
        System.out.println("a.length = " + a.length);
        char[] o = new char[29];
        System.out.println("o[1] = " + o[1]);
        System.out.println(o[1] == '\u0000');
        System.out.println('\u0000');
        System.out.println(o[1] == o[2]);
        System.out.println("Arrays.toString(o) = " + Arrays.toString(o));
    }

    @Test
    public void testArrayIn() {
        arrayIn(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
        arrayIn(new BerylliumSphere[4]);
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[5];
        arrayIn(berylliumSpheres);
//        arrayIn({new BerylliumSphere(),new BerylliumSphere()});
        arrayIn(new int[3]);
        arrayIn(new int[]{1,2,3,4,5,6,});
        arrayIn(new Character[]{'1','2'});
    }

    public void arrayIn(BerylliumSphere[] berylliumSpheres) {
        System.out.println(berylliumSpheres.length);
        System.out.println(Arrays.toString(berylliumSpheres));
    }

    public void arrayIn(int[] a) {
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
    }

    public <T> void arrayIn(T[] t) {
        System.out.println(t.length);
        System.out.println(Arrays.toString(t));
    }


}
