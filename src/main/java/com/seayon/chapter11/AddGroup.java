package com.seayon.chapter11;

import java.util.*;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/7/1 9:41
 * @Description
 */
public class AddGroup {
	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = new Integer[]{6, 7, 8, 9, 10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);

		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		System.out.println("list.get(1) = " + list.get(1));
		list.set(1,21);//Ok modify an element
		System.out.println("list.get(1) = " + list.get(1));
		//list.add(22);
		new LinkedHashSet<>();
	}
}
