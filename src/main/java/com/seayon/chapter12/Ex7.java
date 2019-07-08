package com.seayon.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:09
 * @Description
 */
public class Ex7 {
	private static final Logger logger = Logger.getLogger("Ex7 Exception");
	static void logException(Exception e) {

		StringWriter stringWriter = new StringWriter();
		e.printStackTrace(new PrintWriter(stringWriter));
		logger.severe(stringWriter.toString());

	}
	public static void main(String[] args){
		try {
			int[] a = new int[3];
			a[4] = 3;
		} catch (Exception e) {
			logException(e);
		}finally {
			System.out.println("Finally");
		}
	}
}
