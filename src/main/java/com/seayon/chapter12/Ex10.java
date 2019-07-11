package com.seayon.chapter12;

import org.junit.Test;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:09
 * @Description
 */
class MyException1 extends Exception {
    private String msg;

    public MyException1(String msg) {
        this.msg = msg;
    }
}

class MyException2 extends Exception {
    private String msg;

    public MyException2(String msg) {
        this.msg = msg;
    }
}

public class Ex10 {

    public void f(){
        try {
            g();
        } catch (MyException1 myException1) {
            myException1.printStackTrace();
            throw new RuntimeException(myException1);
//            这里可以用原来的异常来构建一个新的RuntimeException
//            throw (Exception) myException1.fillInStackTrace();
//            throw new MyException2("this is MyException2");
        }
    }

    public void g() throws MyException1 {
        throw new MyException1("this is MyException1");
    }
    @Test
    public void testi() {
        f();
    }
}
