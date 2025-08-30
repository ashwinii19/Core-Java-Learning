package com.techlabs.model;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Demo {

	@Nested
	public class Group1 {
		@Test
		public void Method1() {
			System.out.println("Testing Method 1");
		}
	}

	@Nested
	public class Group2 {
		@Test
		public void Method2() {
			System.out.println("Testing Method 2");
		}
	}
}
