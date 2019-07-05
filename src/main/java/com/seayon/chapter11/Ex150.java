package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import net.mindview.util.Stack;
import org.junit.Test;

import java.util.*;

public class Ex150 {
	public static void main2(String[] args) {
		Stack<String> stringStack = new Stack<>();
		for (String s : "My dog has fleas".split(" ")) {
			stringStack.push(s);
		}
		while (!stringStack.empty()) {
			System.out.print(stringStack.pop() + " ");
		}

		System.out.println();
		java.util.Stack<String> stringStack1 = new java.util.Stack<>();
		for (String s : "My dog has fleas".split(" ")) {
			stringStack1.push(s);
		}
		while (!stringStack1.empty()) {
			System.out.print(stringStack1.pop() + " ");
		}

	}

	@Test
	public void testHash() {
		Random random = new Random(47);
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			set.add(random.nextInt(30) + (1 << 16));
		}
		System.out.println((1 << 16));
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next() - (1 << 16);
			System.out.print(next + ",");

		}

		System.out.println(set);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> intset = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}
}
