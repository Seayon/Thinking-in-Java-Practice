package com.seayon.chapter07.BasicClass;

import static net.mindview.util.Print.print;

//{CompileTimeError}(Won't compile)
public class C extends A {
//	public static final String B = A+"2";
//	public static final String A = "2"; //必须有先后顺序

	public C(String name) {
		super(name);
		print("C constructor");
	}

	@Override
	public void doh() {

	}

	//@Override
	//public void dohnone() {
	//
	//}
}
