package com.seayon.chapter11;

import com.seayon.chapter11.InterfaceVsIterator;
import com.seayon.chapter11.Pet;
import net.mindview.util.CountingGenerator;

import java.util.*;


class NonCollectionSequence extends PetSequence {
    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("不支持的操作！");
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                ArrayList<Pet> strings = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(strings, new Random());
                return strings.iterator();
            }
        };
    }

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

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());

        InterfaceVsIterator.display(nc.reversed().iterator());
        InterfaceVsIterator.display(nc.randomized().iterator());

    }
}

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}