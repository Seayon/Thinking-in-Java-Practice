package com.seayon.chapter15;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/4 18:53
 * @Description
 */
public class Ex6 {
	public class RandomList<T> {
		private ArrayList<T> arrayList = new ArrayList<>();
		private Random random = new Random(47);

		public void add(T t) {
			arrayList.add(t);
		}

		public T select() {
			return arrayList.get(random.nextInt(arrayList.size()));
		}
	}
	public class GenericMethods<T>{
		public T f(T t) {
			return t;
		}
		//泛型方法呀，这种写法不用必须把要泛型的符号 AAA 放到 类上面
		public <AAA> AAA genericM(AAA a) {
			return a;
		}
	}
}
