package com.seayon.chapter02;

import java.util.Date;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2018/12/22 0:19
 * @Description
 */
public class P4_DataOnly {
	public static void main(String[] args){
		class DataOnly{
			int i;
			double d;
			boolean b;

			void show() {
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
		DataOnly dataOnly = new DataOnly();
		dataOnly.i = 1;
		dataOnly.d = 1.11;
		dataOnly.b = false;
		dataOnly.show();
	}
}
