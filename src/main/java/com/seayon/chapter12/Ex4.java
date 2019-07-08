package com.seayon.chapter12;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:09
 * @Description
 */
public class Ex4 {
	public static void main(String[] args){
		try {
			throw new MyEx("My exception!");
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}finally {
			System.out.println("Finally");
		}
	}
}
