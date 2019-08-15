package com.seayon.chapter15;

import com.seayon.typeinfo.Pet;
import net.mindview.util.New;
import org.junit.Test;

import java.util.*;

import static net.mindview.util.New.map;

/**
 * @Version 1.0
 * @author: 赵旭阳
 * @Date: 2019/8/4 18:53
 * @Description
 */
public class Ex6 {
	public class RandomList<T> {
		public void f(Map<String, List<? extends Pet>> petPeople) {
			System.out.println("petPeople = " + petPeople);
			return;
		}
		@Test
		public void test(){

		    //f(New.<String, List<Pet>>map());
		}
		Map<String, List<? extends Pet>> petPeople = new HashMap<String,List<? extends  Pet>>();
		/*Explicit type argument String,List<? extends Pet> can be replaced with <>
		Inspection info: Reports all new expressions with type arguments which can be replaced with diamond type <>
		Such <> syntax is not supported under Java 1.6 or earlier JVMs.*/
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

	public static void main(String args[]){
	    Class c1 = new ArrayList<String>().getClass();
	    Class c2 = new ArrayList<Integer>().getClass();

		System.out.println("(c1==c2) = " + (c1 == c2));
	}
}
