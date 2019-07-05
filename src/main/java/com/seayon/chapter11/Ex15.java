package com.seayon.chapter11;// holding/Ex11.java
// TIJ4 Chapter Holding, Exercise 11, page 409
/* Write a method that uses an Iterator to step through a Collection and
 * print the toString() of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

import net.mindview.util.Stack;

public class Ex15 {
	public static void main(String[] args) {
		System.out.println("+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---");
		String a = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---";
		Stack<Character> stringStack = new Stack<Character>();
		char[] chars = a.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '+') {
				stringStack.push(chars[i+1]);
				i++;
			} else if (chars[i] == '-') {
				System.out.print(stringStack.pop());
				//i++;
			}
		}


		System.out.println("");


		Stack<Character> sc = new Stack<Character>();
		sc.push('U');
		sc.push('n');
		sc.push('c');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('e');
		sc.push('r');
		sc.push('t');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('a');
		sc.push('i');
		sc.push('n');
		sc.push('t');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push(' ');
		System.out.print(sc.pop());
		sc.push('r');
		sc.push('u');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		sc.push('l');
		sc.push('e');
		sc.push('s');
		System.out.print(sc.pop());
		System.out.print(sc.pop());
		System.out.print(sc.pop());
	}
}
