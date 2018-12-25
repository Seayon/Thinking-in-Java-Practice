package com.seayon.chapter03;

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

	public static void main(String[] args){
		/*
	    float expFloat =1.39E-43f;
		System.out.println(expFloat);
		double maxD = Double.MAX_VALUE;;
		System.out.println(maxD);
		double minD = Double.MIN_VALUE;
		System.out.println(minD);

		float maxF = Float.MAX_VALUE;
		System.out.println(maxF);
		float miniF = Float.MIN_VALUE;
		System.out.println(miniF);
		*/

		int i = 4;
		int j = 3;
		System.out.println(Integer.toBinaryString(i ^ j));
	}
}
