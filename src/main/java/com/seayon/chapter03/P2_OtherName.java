package com.seayon.chapter03;

import java.util.Random;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2018/12/23 14:39
 * @Description
 */
public class P2_OtherName {
	public static void main(String[] args) {
		///*
		//Tank t1 = new Tank();
		//Tank t2 = new Tank();
		//t1.score = 1.1f;
		//t2.score = 2.1f;
		//System.out.println("t1.score=" + t1.score);
		//System.out.println("t2.score=" + t2.score);
		//t1.score = t2.score;
		//System.out.println("t1.score=" + t1.score);
		//System.out.println("t2.score=" + t2.score);
		//t1.score = 3.1f;
		//System.out.println("t1.score=" + t1.score);
		//System.out.println("t2.score=" + t2.score);
		//*/
		////Tank tank = new Tank();
		////f(tank);
		////System.out.println(tank.score);
		//Random random = new Random(47);
		//System.out.println(random.nextInt(100) + 1);
		//
		//int i =1;
		//System.out.println("i:" + i);
		//System.out.println("i++:" + i++);
		//System.out.println("i:" + i);
		Dog spot = new Dog();
		spot.name = "spot";
		spot.says = "Ruff!";
		Dog scruffy = new Dog();
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";

		Dog dog3 = new Dog();

		dog3 = spot;
		//System.out.println(false||true);
		//System.out.println(spot == dog3);
		//System.out.println(spot.equals(dog3));
		System.out.println(test1()|| test2() || test3());
	}

	public static boolean test1() {
		System.out.println("test1");
		return true;
	}

	public static boolean test2() {
		System.out.println("test2");
		return false;
	}

	public static boolean test3() {
		System.out.println("test3");
		return true;
	}


	public static void f(Tank tank) {
		tank.score = 2.1f;
	}
}

class Tank {
	float score;
}
