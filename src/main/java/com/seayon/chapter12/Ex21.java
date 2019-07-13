package com.seayon.chapter12;// exceptions/StormyInning20.java
// TIJ4 Chapter Exceptions, Exercise 20, page 
/* MOdify StormyInning.java by adding an UmpireArgument exception type
 * and methods that throw this exception. Test the modified hierarchy.
 */

// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.


abstract class BaseEx21{
    public BaseEx21() throws MyException1 {
        throw new MyException1("BaseException1");
    }
}

class Extend extends BaseEx21 {

    public Extend() throws MyException1 {
        super();
//        这里派生类吧必须抛出异常，因为super必须是构造函数中第一个被调用的方法
//        不弄用try catch 捕获基本抛出的异常
    }
}


public class Ex21{
    public static void main(String args[]){
        try {
            BaseEx21 baseEx21 = new Extend();
        } catch (MyException1 myException1) {
            myException1.printStackTrace();
        }
    }
}
