package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTestCase {

	private Calculator calc;
	 
	@BeforeEach
	void setUp() throws Exception {
		
		calc= new Calculator();
		System.out.println("Calculator Initiated..");
	}

	@AfterEach
	void tearDown() throws Exception {
		
		calc=null;
		System.out.println("Calculator Closed");
	}

	@Test
	public void addtest() {
		
		assertEquals(7, calc.add(4, 3));
		
	}
	
	@Test
	public void subtest() {
		
		assertEquals(5, calc.sub(11, 6));
		assertNotEquals(9, calc.sub(11, 6));
		
	}
	
	@Test
	public void multest() {
		
		assertEquals(66, calc.multiply(11, 6));
		
		
	}
	
	@Test
	public void divtest() {
		
		assertEquals(2, calc.devide(100, 50));
		
		
	}
	 
}
