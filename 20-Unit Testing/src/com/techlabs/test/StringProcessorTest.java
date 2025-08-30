package com.techlabs.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.techlabs.model.StringProcessor;

@DisplayName("String Processor")
public class StringProcessorTest {

	StringProcessor processor;

	@BeforeEach
	public void before() {
		processor = new StringProcessor();
		System.out.println("Test Starting");
	}

	@AfterEach
	public void after() {
		System.out.println("Test Finished");
	}

	@Test
	@Tag("slow")
	@DisplayName("Should return true for palindrome 'madam'")
	public void testPalindromeTrue() {
		assertTrue(processor.isPalindrome("madam"));
	}

	@Test
	@Tag("fast")
	@DisplayName("Should return false for non-palindrome 'hello'")
	public void testPalindromeFalse() {
		assertFalse(processor.isPalindrome("hello"));
	}

	@Test
	@Disabled("Under development")
	@DisplayName("Null input should return false (Disabled)")
	public void testisPalindromeNull() {
		assertFalse(processor.isPalindrome(null));
	}

	@Nested
	@DisplayName("Reverse Method Test")
	public class ReverseTest {

		@RepeatedTest(3)
		@DisplayName("Reverse of 'java' should be 'avaj'")
		void testReverseOnce() {
			assertEquals("avaj", processor.reverse("java"));
		}

	}
}
