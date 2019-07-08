package com.seayon.chapter12;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:09
 * @Description
 */
public class Ex1 {
	public static void main(String[] args){
		try {
			throw new Exception("this is a Exp");
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println();
			e.printStackTrace(System.err);
			System.out.println();
			//e.printStackTrace();
			//System.out.println();
		}finally {
			System.out.println("Finally");
		}

	}
}
