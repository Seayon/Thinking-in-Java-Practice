package com.seayon.typeinfo;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/27 10:57
 * @Description
 */
public class Pet {
	private String name;

	public Pet() {
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Pet{");
		sb.append("name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public Pet(String name) {
		this.name = name;
	}
}
