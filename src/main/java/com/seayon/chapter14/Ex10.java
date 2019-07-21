package com.seayon.chapter14;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/21 13:57
 * @Description
 */
public class Ex10 {
	public static boolean isTypeOrObject(char[] chars) {
		return chars instanceof Object;
	}

	public static void main2(String[] args) {
		char[] chars = new char[]{'a', 'b'};
		System.out.println("isTypeOrObject(chars) = " + isTypeOrObject(chars));
		System.out.println("isTypeOrObject(chars) = " + isTypeOrObject(chars));
	}

	public static void main(String[] args) {
		Class<Ex8> ex8Class = Ex8.class;
		Class  integerClass = int.class;
		integerClass = double.class;

		char[] c = new char[10];
		// c is an Object:
		System.out.println("Superclass of char[] c: " +
				c.getClass().getSuperclass());
		System.out.println("char[] c instanceof Object: " +
				(c instanceof Object));


	}
}
