package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex12 {
	public static void printAny(Collection c) {
		for (Object o : c) {
			print(o + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
		ListIterator<Integer> integerListIterator1 = list1.listIterator(list1.size() );

		ListIterator<Integer> integerListIterator2 = list2.listIterator();
		while (integerListIterator2.hasNext()) {
			integerListIterator2.next();//这里在使用对象之前必须先调用next()方法
			integerListIterator2.set(integerListIterator1.previous());
		}

		System.out.println(list2);
	}

	//public static void main(String[] args) {
	//	List<Integer> li1 =
	//			new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
	//	List<Integer> li2 =
	//			new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
	//	ListIterator<Integer> it1 = li1.listIterator();
	//	ListIterator<Integer> it2 = li2.listIterator();
	//	//println("li1: " + li1);
	//	//println("li2: " + li2);
	//	// move it1 to end:
	//	while(it1.hasNext()) {
	//		it1.next();
	//	}
	//	// now use it2 to re-set li2:
	//	while(it2.hasNext()) {
	//		it2.next();
	//		it2.set(it1.previous());
	//	}
	//	//println("li1: " + li1);
	//	//println("li2: " + li2);
	//
	//}
}
