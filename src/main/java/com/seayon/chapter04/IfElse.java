package com.seayon.chapter04;

import org.junit.Test;

import java.util.Random;

import static net.mindview.util.Print.print;
import static net.mindview.util.Range.range;
import static net.mindview.util.Print.printnb;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/5/4 17:40
 * @Description
 */
public class IfElse {
    @Test
    public void test() {
        while (condition()) {
            System.out.println("inside'while'");
        }
        System.out.println("Exited'while'");
    }

    public boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ",");
        return result;
    }

    @Test
    public void test2() {
        int last = 0;
        for (int i = 0; i < 25; i++) {
            int now = new Random().nextInt(100);
            if (last > now) {
                System.out.println("last大于now = " + last + " " + now);
            } else if (last == now) {
                System.out.println("last等于now = " + last + " " + now);
            } else {
                System.out.println("last小于now = " + last + " " + now);
            }
            last = now;
        }
    }

    @Test
    public void test3() {
        int last = 0;
        while (true) {
            int now = new Random().nextInt(1000);
            if (last > now) {
                System.out.println("last大于now = " + last + " " + now);
            } else if (last == now) {
                System.out.println("last等于now = " + last + " " + now);
            } else {
                System.out.println("last小于now = " + last + " " + now);
            }
            last = now;
        }
    }

    /**
     * 打印素数
     */

    @Test
    public void test4() {
        for (int i = 2; i < 10000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("素数：" + i);
            }
        }
    }

    @Test
    public void testRange() {
        for (int i : range(10)) {
            printnb(i + " ");
        }
        print();
        for (int i : range(5, 10)) {
            printnb(i + " ");
        }
        print();
        for (int i : range(4, 20, 2)) {
            printnb(i + " ");
        }
        print();
    }

    //Java标签，嵌套循环的使用
    @Test
    public void testLabel() {
        int i = 0;
        outer:
        for (; true; ) {
            inner:
            for (; i < 10; i++) {
                print("i=" + i);
                if (i == 2) {
                    print("continue");
                    i++;
                    continue;
                }
                if (i == 3) {
                    print("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    print("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    print("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        print("contine inner");
                        continue inner;
                    }
                }
            }

        }
    }

    //    Java 7 以后switch参数可以支持String
    @Test
    public void testswitch() {
        String a = "Astr";
        switch (a) {
            case "a":
                System.out.println("this is a");
                break;
            case "b":
                System.out.println("this is b");
                break;
            case "Astr":
                System.out.println("Astr");
            default:
                System.out.println("default");
        }
    }

    @Test
    public void testFibonacciMain() {
        testFibonacci5(100);
//        for (int i = 0; i < 30; i++) {
//            System.out.println(fibonacci(i));
//        }


    }


    public void testFibonacci5(int k) {
        long a1 = 1;
        long a2 = 1;
        for (int i = 1; i <= k; i++) {
            if (i < 3) {
                System.out.println(1);
            } else {
                System.out.println(a1 + a2);
                long temp = a2;
                a2 = a1 + a2;
                a1 = temp;
            }
        }
    }

    public int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }


    @Test
    public void testVampire() {
        for (int i = 1001; i < 10000; i++) {
            int k1 = i % 1000;
            int k2 = (i % 100 - k1) / 10;
            int k3 = (i % 10 - k1 - k2) / 100;
            int k4 = (i - k1 - k2 - k3) / 1000;
            Integer k1k2 = Integer.valueOf(k1 + "" + k2);
            Integer k2k1 = Integer.valueOf(k2 + "" + k1);
            Integer k3k4 = Integer.valueOf(k3 + "" + k4);
            Integer k4k3 = Integer.valueOf(k4 + "" + k3);

        }
    }
}
