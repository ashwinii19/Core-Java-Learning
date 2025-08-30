package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.techlabs.model.Calculator;

@DisplayName("Calculator")
public class CalculatorTest {

	Calculator calculator;

	@BeforeAll
	public static void start() {
		System.out.println("Before Starting");
	}

	@AfterAll
	public static void end() {
		System.out.println("Ending");
	}

	@BeforeEach
	public void beforeAnyTest() {
		System.out.println("Now test is about to start");
		calculator = new Calculator();
	}

	@AfterEach
	public void afterAnyTest() {
		System.out.println("Current test is completed");
	}

	@Test
	@DisplayName("Addition of two Numbers")
	public void testAddition() {
		int sum = calculator.addition(2, 3);
		assertEquals(5, sum);
	}

	@Test
	@Tag("slow")
	public void testSubtraction() {
		assertEquals(5, calculator.subtraction(10, 5));
	}

	@Test
	public void testTrue() {
		int age = 28;
		assertTrue(age > 20);
	}

	@RepeatedTest(2)
	public void testDivision() {
		assertDoesNotThrow(() -> calculator.division(10, 10));
	}

	@RepeatedTest(name = "Test {currentRepetition} of {totalRepetition}", value = 5)
	public void testDivsionByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.division(10, 0));
	}

	@Test
	@Disabled("Under Development")
	public void testString() {
		String name = "Ashwini";
		assertTrue(name.length() < 8);

	}

	@RepeatedTest(5)
	public void randomNumberTest() {
		Random random = new Random();
		int count = random.nextInt();
		assertFalse(count > 0 && count < 100);
	}

	@ParameterizedTest(name = "Test isPrime({0}) - should be TRUE")
	@ValueSource(ints = { 2, 3, 5, 7, 11, 13, 17 })
	@DisplayName("Prime number test cases")
	void test_isPrime_with_prime_numbers(int number) {
		assertTrue(calculator.isPrime(number), number + " should be prime");
	}

	@ParameterizedTest(name = "Test isPrime({0}) - should be FALSE")
	@ValueSource(ints = { 0, 1, 4, 6, 8, 9, 10, 12 })
	@DisplayName("Non-prime number test cases")
	void test_isPrime_with_non_prime_numbers(int number) {
		assertFalse(calculator.isPrime(number), number + " should not be prime");
	}
}
