package com.seayon.chapter12;// exceptions/StormyInning20.java
// TIJ4 Chapter Exceptions, Exercise 20, page 
/* MOdify StormyInning.java by adding an UmpireArgument exception type
 * and methods that throw this exception. Test the modified hierarchy.
 */

// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.


class FailingConstructor {
    public FailingConstructor() throws MyException1 {

    }
}


public class Ex22 {
    public static void main(String args[]) {
        FailingConstructor failingConstructor;
        try {
            failingConstructor = new FailingConstructor();
        } catch (MyException1 myException1) {
            myException1.printStackTrace();
            failingConstructor = null;
        }
    }
}
