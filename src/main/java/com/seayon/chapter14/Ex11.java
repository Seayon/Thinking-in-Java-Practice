package com.seayon.chapter14;

// typeinfo/Ex11.java
// TIJ4 Chapter Typeinfo, Exercise 11, page 582
// Add Gerbil to the typeinfo.pets library and modify all the examples
// in this chapter to adapt to this new class.
import com.seayon.chapter11.Pet;
import com.seayon.chapter11.Pets;
import net.mindview.util.TypeCounter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/*
	// Made following additions:
	// typeinfo.pets package:
	// typeinfo/pets/Gerbil.java
	package typeinfo.pets;
	public class Gerbil extends Rodent {
		public Gerbil(String name) { super(name); }
		public Gerbil() { super(); }
	}
	// ForNameCreator.java
	"typeinfo.pets.Gerbil"
	// PetCount.java
	if(pet instanceof Gerbil) counter.count("Gerbil");
	// LiteralPetCreator.java
	Gerbil.class
*/

public class Ex11 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }


    @Test
    public void testList() {
        List<List<String>> out = new ArrayList<>();
        List<String> in = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            in.add("A");
            in.add("B");
            in.add("C");
            in.add("D");
            out.add(in);
        }
        System.out.println("out = " + out);
    }
}

