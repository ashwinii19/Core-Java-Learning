package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.techlabs.model.Mathutils;

@DisplayName("Math Utils")
public class MathutilsTest {

	Mathutils math = new Mathutils();

	@BeforeEach
	public void before() {
		System.out.println("Test Starting");
	}

	@AfterEach
	public void after() {
		System.out.println("Test Finished");
	}

	@Test
	@DisplayName("Test Addition Method")
	public void testAddition() {
		int sum = math.addition(2, 3);
		assertEquals(5, sum);
	}

	@Test
	@DisplayName("Test Multiplication Method")
	public void testMultiplication() {
		int mul = math.multiplication(2, 3);
		assertEquals(6, mul);  
	}

	@ParameterizedTest    //execute a single test method multiple times with different parameters
	@ValueSource(ints = {2, 4, 6, 0, -8})
	@DisplayName("Test isEven() with even numbers")
	public void testisEvenWithEvenNumbers(int number) {
		assertTrue(math.isEven(number), number + " should be even");
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 3, -5, 7, 9})
	@DisplayName("Test isEven() with odd numbers")
	public void testisEvenWithOddNumbers(int number) {
		assertFalse(math.isEven(number), number + " should be odd");  
	}
}
