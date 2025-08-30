package com.techlabs.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.techlabs.model.GradeValidator;

public class GradeValidatorTest {

	GradeValidator validator;

	@BeforeEach
	public void before() {
		validator = new GradeValidator();
		System.out.println("Test Starting");
	}

	@AfterEach
	public void after() {
		System.out.println("Test Finished");
	}

	@Nested
	@DisplayName("Tests for isGradeValid()")
	public class isGradeValidatorTest {

		@ParameterizedTest
		@ValueSource(ints = { 0, 50, 100 })
		@DisplayName("Should return true for valid grades between 0 and 100")
		public void testValidGrade(int grade) {
			assertTrue(validator.isGradeValidator(grade), grade + " should be valid");
		}

		@ParameterizedTest
		@ValueSource(ints = { -10, -1, 101, 150 })
		@DisplayName("Should return false for valid grades outside 0 to 100")
		public void testInvalidGrade(int grade) {
			assertFalse(validator.isGradeValidator(grade), grade + " should be valid");
		}
	}

	
	@Nested
	@DisplayName("Tests for getGradeCategory()")
	class GradeCategoryTests {

		@ParameterizedTest(name = "Grade: {0} → Category: {1}")
		@CsvSource({ "0, Fail", "49, Fail", "50, Pass", "60, Pass", "74, Pass", "75, Distinction", "85, Distinction", "100, Distinction" })
		@DisplayName("Should return correct grade category")
		void testGradeCategories(int grade, String expectedCategory) {
			assertEquals(expectedCategory, validator.getGradeCategory(grade));
		}
	}

}
