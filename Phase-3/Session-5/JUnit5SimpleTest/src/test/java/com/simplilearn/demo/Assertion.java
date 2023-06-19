package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assertion {

	 public boolean checkAge(int age) {
		
		 return age >=18;
		 
	 }
	 
	 @Test
	 public void testAssertion() {
		 
		 assertTrue(checkAge(18));
		 
		 assertEquals(6, 4+2);
		 
	 }
	 @Test
	 public void testAssertion1() {
		 
		 assertEquals(6, 4+2);
		 int a=67; 
		 int b= 89;
		 
		 assertTrue(b>a);
		 assertFalse(b<a);
		 
		 String name=null;
		 
		 assertNull(name);
		 
		 String name1="Nikunj Soni";
		 assertNotNull(name1);
		 
	 }

	 
	 @Test
	 public void testThrow() {
		 assertThrows(RuntimeException.class, ()->{throw new RuntimeException("Not Valid");});
		 
		 assertThrows(ArithmeticException.class, ()->{int x=10/0; System.out.println(x);});
		 
		 assertThrows(NullPointerException.class, ()->{String x=null; System.out.println(x.toLowerCase());});
		 
	 }
}
