package com.seayon.chapter11;

import java.util.Random;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/10 9:44
 * @Description
 */
public class RandomRodentGenerator {
	private Random rand = new Random();
	public Rodent next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse();
			case 1: return new Rat();
			case 2: return new Squirrel();
		}
	}
}
