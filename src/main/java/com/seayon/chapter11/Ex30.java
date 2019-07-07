package com.seayon.chapter11;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class Ex30 {
    public static void main(String args[]) {
        CollectionSequence collectionSequence = new CollectionSequence();
        InterfaceVsIterator.display(collectionSequence);
        InterfaceVsIterator.display(collectionSequence.iterator());
    }
}

class Pets {
    static Pet[] createArray(int n) {
        Pet[] pets = new Pet[n];
        for (int i = 0; i < n; i++) {
            pets[i] = new Pet(i);
        }
        return pets;
    }
}

class Pet {
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                '}';
    }

    int id;

    public Pet(int id) {
        this.id = id;
    }

    int id() {
        return this.id;
    }
}

class CollectionSequence implements Collection {
    private Pet[] pets = Pets.createArray(8);

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

