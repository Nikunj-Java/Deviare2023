package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	@DisplayName("OuterTest")
	void test1() {
		System.out.println("Test Case From Outer-1");
	}
	
	
	@Nested
	class Inner {
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each");
		}
		
		@Test
		@DisplayName("InnerTest")
		void InnerTest() {
			System.out.println("Inner Test");
		}
		
		@Nested
		class WhenX{
			
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each");
			}
			
			@Test
			@DisplayName("WhenX Test")
			void testWhenX() {
				System.out.println("Test case from WHEN-X");
			}
		}
		
	}

}
