package com.seayon.chapter12;
import com.seayon.chapter05.Apple;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:09
 * @Description
 */
public class Ex3 {
	public static void main(String[] args){
		try {
			int[] a = new int[3];
			a[4] = 3;
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}finally {
			System.out.println("Finally");
		}
	}
}
