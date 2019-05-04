package com.seayon.chapter02;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2018/12/22 0:19
 * @Description
 */
public class P3_ATypeName {
	public static void main(String[] args){
		class ATypeName {
				int i;
				double d;
				boolean b;

			void show() {
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
		ATypeName aTypeName = new ATypeName();
		aTypeName.i = 3;
		aTypeName.b = false;
		aTypeName.d = 3.333;
		aTypeName.show();

	}


}
