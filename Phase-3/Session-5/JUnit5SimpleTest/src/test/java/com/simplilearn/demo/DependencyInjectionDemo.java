package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class DependencyInjectionDemo {

	 public DependencyInjectionDemo(TestInfo info) {
		 System.out.println(info.getDisplayName());
		 
	 }
	 
	 @Test
	 @DisplayName("My TestMethod 1")
	 public  void myTest(TestInfo info) {
		 assertEquals("My TestMethod 1", info.getDisplayName());
	 }
	 
	 @Test
	 @DisplayName("My Test Method 2")
	 @Tag("MyTag")
	 public  void myTest1(TestInfo info) {
		 assertEquals("My Test Method 2", info.getDisplayName());
		 System.out.println("MyTag Name is:" +info.getTags());
		 assertTrue(info.getTags().contains("MyTag"));
	 }
	 
	 
	 

}
