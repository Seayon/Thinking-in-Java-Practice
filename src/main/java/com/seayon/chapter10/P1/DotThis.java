package com.seayon.chapter10.P1;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/6/28 17:21
 * @Description
 */
public class DotThis {
	void f() {
		System.out.println("DoThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}

	public Inner inner() {
		return new Inner();
	}
	public static void main(String[] args){
		DotThis dotThis = new DotThis();
		DotThis.Inner inner = dotThis.inner();
		inner.outer().f();
	}
}
