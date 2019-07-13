package com.seayon.chapter12;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/8 14:29
 * @Description
 */
public class MyEx extends RuntimeException {
	private String msg;

	public MyEx(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("MyEx{");
		sb.append("msg='").append(msg).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
