package com.seayon.chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/23 22:30
 * @Description
 */
public class Ex19 {

	public static void main(String[] args){
		try {
			Class<?> c = Class.forName("com.seayon.chapter14.ToyTest1");
			Object o = c.getDeclaredConstructor().newInstance();
			System.out.println("o.toString() = " + o.toString());


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
