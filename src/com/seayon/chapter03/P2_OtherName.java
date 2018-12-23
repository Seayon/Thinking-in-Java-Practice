package com.seayon.chapter03;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2018/12/23 14:39
 * @Description
 */
public class P2_OtherName {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.score = 1.1f;
		t2.score = 2.1f;
		System.out.println("t1.score=" + t1.score);
		System.out.println("t2.score=" + t2.score);
		t1.score = t2.score;
		System.out.println("t1.score=" + t1.score);
		System.out.println("t2.score=" + t2.score);
		t1.score = 3.1f;
		System.out.println("t1.score=" + t1.score);
		System.out.println("t2.score=" + t2.score);
	}
}

class Tank {
	float score;
}
