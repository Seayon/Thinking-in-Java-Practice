package com.seayon.chapter12;

import org.junit.Test;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:09
 * @Description
 */
public class Ex5 {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5};
		int i = 10;


		while (true) {
			try {
				a[i] = 9;
				System.out.println("a[i] = " + a[i]);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				i--;
			}finally {
				System.out.println("完成啦没？");
			}
		}
	}
}
