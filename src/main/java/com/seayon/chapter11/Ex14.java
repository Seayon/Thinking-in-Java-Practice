package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex14 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6};
		for (Integer integer : integers) {
			ListIterator<Integer> integerListIterator1 = linkedList.listIterator(linkedList.size() / 2);//这个获取迭代器，其实是获取到当前的指针位置
			integerListIterator1.add(integer);
			System.out.println(linkedList);
		}
	}
}
