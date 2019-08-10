package com.seayon.chapter15;// generics/Generators13.java
// TIJ4 Chapter Generics, Exercise 13, page 637
/* Overload the fill() method so that the arguments and return types are
 * the specific subtypes of Collection: List, Queue and Set. This way, you
 * don't lose the type of container. Can you overload to distinguish between
 * List and LinkedList?
 */
import com.seayon.chapter11.RandomRodentGenerator;

import java.util.*;
import net.mindview.util.*;
import org.junit.Test;
import sun.nio.cs.Surrogate;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Generators13 {
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
		for(int i = 0; i < n; i++) coll.add(gen.next());
		return coll;
	}
	public static <T> List<T> fill(List<T> l, Generator<T> gen, int n) {
		for(int i = 0; i < n; i++) l.add(gen.next());
		return l;
	}
	public static <T> Queue<T> fill(Queue<T> q, Generator<T> gen, int n) {
		for(int i = 0; i < n; i++) q.add(gen.next());
		return q;
	}
	public static <T> Set<T> fill(Set<T> s, Generator<T> gen, int n) {
		for(int i = 0; i < n; i++) s.add(gen.next());
		return s;
	}
	// return type LinkedList:
	public static <T> LinkedList<T> fill(LinkedList<T> ll, Generator<T> gen, int n) {
		for(int i = 0; i < n; i++) ll.add(gen.next());
		return ll;
	}
	@Test
	public void test(){

		List<String> coffeeList = fill(new ArrayList<String>(), new StringGenerator(), 5);
		println("List type: " + coffeeList.getClass());
		println("coffeeList:" + coffeeList);

		LinkedList<String> coffeeLinkedList = fill(new LinkedList<String>(), new StringGenerator(), 5);
		println("LinkedList type: " + coffeeLinkedList.getClass());
		println("coffeeLinkedList: " + coffeeLinkedList);
	}

	class StringGenerator implements Generator<String> {
		@Override
		public String next() {
			return String.valueOf(new Random().nextInt());
		}
	}

}

