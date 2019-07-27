package com.seayon.chapter15;

import com.seayon.typeinfo.Pet;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/27 10:59
 * @Description
 */
public class Ex2Holder<T> {
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Ex2Holder{");
		sb.append("a=").append(a);
		sb.append(", b=").append(b);
		sb.append(", c=").append(c);
		sb.append('}');
		return sb.toString();
	}

	private T a,b,c;

	public Ex2Holder(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public T getC() {
		return c;
	}

	public void setC(T c) {
		this.c = c;
	}

	public static void main(String[] args){
		Ex2Holder<Pet> ex2Holder = new Ex2Holder<>(new Pet("a"), new Pet("b"), new Pet("c"));
		System.out.println("ex2Holder.toString() = " + ex2Holder.toString());

	}
}
