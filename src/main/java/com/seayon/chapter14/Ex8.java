package com.seayon.chapter14;

import java.lang.reflect.Field;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/21 13:52
 * @Description
 */
class A {private String a;}

class B extends A {private String b;}

class C extends B {private String c;}

public class Ex8 {
	public static void Hierarchy(Object o) {
		Field[] declaredFields = o.getClass().getDeclaredFields();
		if (declaredFields.length == 0) {
			System.out.println(o.getClass().getName() + "has no fileds");
		}else{
			for (Field declaredField : declaredFields) {
				System.out.println("declaredField = " + declaredField);
			}
		}
		if(o.getClass().getSuperclass() != null) {
			System.out.println(o.getClass() + " is a subclass of " +
					o.getClass().getSuperclass());
			try {
				Hierarchy(o.getClass().getSuperclass().newInstance());
			} catch(InstantiationException e) {
				System.out.println("Unable to instantiate obj");
			} catch(IllegalAccessException e) {
				System.out.println("Unable to access");
			}
		}
	}
	public static void main(String[] args) {
		Hierarchy(new C());
	}
}
