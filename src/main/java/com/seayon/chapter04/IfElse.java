package com.seayon.chapter04;

import org.junit.Test;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/5/4 17:40
 * @Description
 */
public class IfElse {
	@Test
	public void test() {
		while (condition()) {
			System.out.println("inside'while'");
		}
		System.out.println("Exited'while'");
	}

	public boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.println(result + ",");
		return result;
	}
}
