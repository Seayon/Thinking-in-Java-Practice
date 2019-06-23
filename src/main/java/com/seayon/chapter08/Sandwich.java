package com.seayon.chapter08;

import org.junit.Test;

import static net.mindview.util.Print.print;

public class Sandwich {
    // polymorphism/Sandwich11.java
// TIJ4 Chapter Polymorphism, Exercise 11, page 295
// Add class Pickle to Sandwich.java


    class Meal {
        Meal() {
            print("Meal()");
        }
    }

    class Bread {
        Bread() {
            print("Bread()");
        }
    }

    class Cheese {
        Cheese() {
            print("Cheese()");
        }
    }

    class Lettuce {
        Lettuce() {
            print("Lettuce()");
        }
    }

    class Pickle {
        Pickle() {
            print("Pickle()");
        }
    }

    class Lunch extends Meal {
        Lunch() {
            print("Lunch()");
        }
    }

    class PortableLunch extends Lunch {
        PortableLunch() {
            print("PortableLunch()");
        }
    }

    public class Sandwich11 extends PortableLunch {
        private Bread b = new Bread();
        private Cheese c = new Cheese();
        private Pickle p = new Pickle();
        private Lunch l = new Lunch();

        public Sandwich11() {
            print("Sandwich()");
        }
    }


    @Test
    public void testS() {
        new Sandwich11();
    }
}
