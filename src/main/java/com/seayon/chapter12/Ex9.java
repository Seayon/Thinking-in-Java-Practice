package com.seayon.chapter12;

import com.seayon.chapter05.Apple;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:09
 * @Description
 */
class MyEx1 extends Exception {
    private String msg;

    public MyEx1(String msg) {
        this.msg = msg;
    }
}

class MyEx2 extends Exception {
    private String msg;

    public MyEx2(String msg) {
        this.msg = msg;
    }
}

class MyEx3 extends Exception {
    private String msg;

    public MyEx3(String msg) {
        this.msg = msg;
    }
}

public class Ex9 {
    public static void main(String[] args) {
        try {
//            if (true) {
//                throw new MyEx1("this is MyEx1");
//            }
//            if (true) {
//                throw new MyEx2("this is MyEx2");
//            }
//            if (true) {
//                throw new MyEx3("this is MyEx3");
//            }
            args = null;
            System.out.println("args.length = " + args.length);
        } catch (Exception e) {
            System.out.println("Cause exception");
            e.printStackTrace(System.out);
        }finally {
            System.out.println("This is finally");
        }


    }
}
