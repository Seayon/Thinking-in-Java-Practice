package com.seayon.chapter11;

import java.util.Iterator;
import java.util.Random;

import static net.mindview.util.Print.print;

public class Ex31 {
    public static void main(String args[]) {
        RandomShapeGenerator shapes = new RandomShapeGenerator(30);
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
        }
    }
}

//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.

class RandomShapeGenerator implements Iterable<Shape> {
    private Shape[] shapes;

    public RandomShapeGenerator(int number) {
        shapes = new Shape[number];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = next();
        }
    }

    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}


class Shape {
    public void draw() {
    }

    public void erase() {
    }
} ///:~
//: polymorphism/shape/Circle.java

class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }
} ///:~
//: polymorphism/shape/Square.java

class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }
} ///:~
//: polymorphism/shape/Triangle.java

class Triangle extends Shape {
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
} ///:~
//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
