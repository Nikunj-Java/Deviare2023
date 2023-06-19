package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println("THIS RUN ON OS-WINDOWS");
	}
	
	@Test
	@DisabledOnOs({OS.MAC})
	public void notrunOnMac() {
		System.out.println("THIS WILL NOT RUN ON OS-MAC");
	}
	
	
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMac() {
		System.out.println("THIS WILL RUN ON OS-MAC");
	}
	
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println("THIS WILL RUN ON OS-LINUX");
	}

}
