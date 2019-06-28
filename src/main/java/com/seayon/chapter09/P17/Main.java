package com.seayon.chapter09.P17;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/6/26 9:34
 * @Description (?<=\[)()(?=].)
 */
public class Main {
	String regex = "=[180141000010002.编码]+[180141000210006.数量]";

	@Test
	public void testRegex(){
		Pattern pattern = Pattern.compile("(?<=\\[)(\\w*\\..*?)(?=].)");

		Matcher matcher = pattern.matcher(regex);
		System.out.printf("2", "s");
	}

	public class Bimp implements Months.H {
		@Override
		public void f() {

		}
	}

	private interface D {

	}


}
