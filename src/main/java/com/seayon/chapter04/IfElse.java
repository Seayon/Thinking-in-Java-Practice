package com.seayon.chapter04;

import org.junit.Test;

import java.util.Random;

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

	@Test
	public void test2() {
		int last =0;
		for (int i = 0; i < 25; i++) {
			int now = new Random().nextInt(100);
			if (last > now) {
				System.out.println("last大于now = " + last +" " +now);
			} else if (last == now) {
				System.out.println("last等于now = " + last +" " +now);
			}else{
				System.out.println("last小于now = " + last +" " +now);
			}
			last = now;
		}
	}

	@Test
	public void test3() {
		int last =0;
		while (true){
			int now = new Random().nextInt(1000);
			if (last > now) {
				System.out.println("last大于now = " + last +" " +now);
			} else if (last == now) {
				System.out.println("last等于now = " + last +" " +now);
			}else{
				System.out.println("last小于now = " + last +" " +now);
			}
			last = now;
		}
	}


	
}
