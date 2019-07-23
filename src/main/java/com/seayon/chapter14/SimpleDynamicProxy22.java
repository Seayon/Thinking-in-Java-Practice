package com.seayon.chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/23 23:34
 * @Description
 */

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;
	private static int count = 0;
	public DynamicProxyHandler(Interface i) {
		this.proxied = i;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**** proxy: " + proxy.getClass() +
				", method: " + method + ", args: " + args);
		if (args != null) {

			for (Object arg : args) {
				System.out.println("arg = " + arg);
			}
		}

		count ++;
		System.out.println("count = " + count);
		return method.invoke(this.proxied, args);
	}
}

public class SimpleDynamicProxy22 {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("Seayon|阿阳");
	}
	public static void main(String[] args){
		RealObject realObject = new RealObject();
		consumer(realObject);

		Interface in = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(realObject));
		consumer(in);
	}
}
