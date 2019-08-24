package com.seayon.chapter16;

import org.junit.Test;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        BeryllinumSphere[] a;
        BeryllinumSphere[] b = new BeryllinumSphere[5];
        BeryllinumSphere[] d = {};
        BeryllinumSphere[] c = {new BeryllinumSphere("a"), new BeryllinumSphere("b")};//普通的聚集初始化的语法创建
//        a = {new BeryllinumSphere()};  //聚集初始化必须在定义的位置用,上述 c这里这种写法行不通
        a = new BeryllinumSphere[]{new BeryllinumSphere()};
//        动态的聚集初始化索引,不受必须在定义时使用的限制,不管是在定义时使用还是定义以后再用都可以
        BeryllinumSphere[] e = new BeryllinumSphere[]{new BeryllinumSphere()};
        a = new BeryllinumSphere[]{new BeryllinumSphere(), new BeryllinumSphere()};
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
        arrayIn(new BeryllinumSphere[]{new BeryllinumSphere(), new BeryllinumSphere(), new BeryllinumSphere()});
        arrayIn(new BeryllinumSphere[4]);
        BeryllinumSphere[] beryllinumSpheres = new BeryllinumSphere[5];
        arrayIn(beryllinumSpheres);
//        arrayIn({new BeryllinumSphere(),new BeryllinumSphere()});
        arrayIn(new int[3]);
        arrayIn(new int[]{1,2,3,4,5,6,});
        arrayIn(new Character[]{'1','2'});
    }
    public void arrayIn(BeryllinumSphere[] beryllinumSpheres) {
        System.out.println(beryllinumSpheres.length);
        System.out.println(Arrays.toString(beryllinumSpheres));
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
