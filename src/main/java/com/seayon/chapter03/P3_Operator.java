package com.seayon.chapter03;

import com.seayon.utils.MyPrint;
import org.junit.Test;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2018/12/25 23:13
 * @Description
 */
public class P3_Operator {
	/*
	public static void main(String[] args){
	    long n1 = 200L;
	    long n2 = 0xA1;
	    long o1 = 0123;
	    long o2 = 123;
		System.out.println(Long.toBinaryString(n2));
		System.out.println(Long.toBinaryString(n1));
		System.out.println(Long.toBinaryString(o1));
		System.out.println(Long.toBinaryString(o2));
	}
	*/

	public static void main(String[] args) {
		float expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double maxD = Double.MAX_VALUE;
		;
		System.out.println(maxD);
		double minD = Double.MIN_VALUE;
		System.out.println(minD);

		float maxF = Float.MAX_VALUE;
		System.out.println(maxF);
		float miniF = Float.MIN_VALUE;
		System.out.println(miniF);

		int i = 4;
		int j = 3;
		System.out.println(Integer.toBinaryString(i ^ j));
	}

	@Test
	public void test() {
		double above = 0.7f, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		System.out.println("(int)above =" + (int) above);
		System.out.println("(int)below =" + (int) below);
		System.out.println("(int)above =" + (int) fabove);
		System.out.println("(int)above =" + (int) fbelow);
	}

	@Test
	public void test2() {
		double d = 1.9004d;
		double a = 1.9005d;
		double above = 0.7f, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		System.out.println("Math.round(above) =" + Math.round(d));
		System.out.println("Math.round(above) =" + Math.round(a));
		System.out.println("Math.round(above) =" + Math.round(above));
		System.out.println("Math.round(below) =" + Math.round(below));
		System.out.println("Math.round(above) =" + Math.round(fabove));
		System.out.println("Math.round(above) =" + Math.round(fbelow));
	}
}
