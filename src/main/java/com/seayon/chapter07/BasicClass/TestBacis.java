package com.seayon.chapter07.BasicClass;

import org.junit.Test;

public class TestBacis {
   @Test
   public void testi() {
	   C c = new C("name");
	   c.doh();
	   c.dob();
	   try {
		   Class.forName("com.seayon.chapter07.BasicClass.TestBacis");
	   } catch (ClassNotFoundException e) {
		   e.printStackTrace();
	   }
   }
}
