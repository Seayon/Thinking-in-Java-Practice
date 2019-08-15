package com.seayon.chapter15;


import com.seayon.typeinfo.Gerbil;
import com.seayon.typeinfo.Pet;


/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/27 10:49
 * @Description
 */
public class Holder3<T> {
	private T a;
	public Holder3(T a){
		this.a = a;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	public static void main(String[] args){
		Holder3<Pet> holder3 = new Holder3<>(new Pet());
		System.out.println("holder3.getA() = " + holder3.getA());
		holder3.setA(new Gerbil());
		System.out.println("holder3.getA() = " + holder3.getA());

	}
}
