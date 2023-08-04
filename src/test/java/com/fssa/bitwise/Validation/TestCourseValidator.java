package com.fssa.bitwise.Validation;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.bitwise.errors.CourseValidatorError;
import com.fssa.bitwise.model.Course;
import com.fssa.bitwise.validation.CourseValidator;

public class TestCourseValidator {

	Course validCourse = new Course("Java_001", "Web development", "fjejj", "fjfek", "balaji",
			LocalDate.of(2005, 3, 3), LocalDate.of(2005, 3, 3));

	Course inValidCourse = new Course(null, null, null, null, null, null, null);

	@Test
	public void testValidate() throws Exception {

		Assertions.assertTrue(CourseValidator.Validate(validCourse));
	}

	@Test
	public void testInvalid() {

		try {

			CourseValidator.Validate(null);
		} catch (Exception e) {

			Assertions.assertEquals(CourseValidatorError.INVALID_ERROR, e.getMessage());
		}
	}

	@Test
	public void testValidateId() throws Exception {

		Assertions.assertTrue(CourseValidator.validateCourseId(validCourse.getCourseid()));
	}

	@Test
	public void testInvalidId() {

		try {

			CourseValidator.validateCourseId(inValidCourse.getCourseid());
		} catch (Exception e) {

			Assertions.assertEquals(CourseValidatorError.INVALID_ID_NULL, e.getMessage());
		}

		
		try {

			CourseValidator.validateCourseId("e");
		} catch (Exception e) {

			Assertions.assertEquals(CourseValidatorError.INVALID_ID, e.getMessage());
		}
	}
	
	
	
	@Test
	public void testValidateName() throws Exception {
		
		try {
		String coursename = "Java";
		Course coursename1 = new Course(coursename, coursename, coursename, coursename, coursename, null, null);
		coursename1.setCourseName(coursename);
		CourseValidator.validateCourseName(coursename1.getCourseName());
		}
		catch(Exception e) {
 
			Assertions.assertEquals(CourseValidatorError.INVALID_NAME, e.getMessage());
		}
	}
	

	@Test
	public void testInvalidName() {

		try {

			CourseValidator.validateCourseName(inValidCourse.getCourseName());
		} catch (Exception e) {

			Assertions.assertEquals(CourseValidatorError.INVALID_NAME_NULL, e.getMessage());
		}

		
		try {

			CourseValidator.validateCourseName("#@");
		} catch (Exception e) {

			Assertions.assertEquals(CourseValidatorError.INVALID_NAME, e.getMessage());
		}
	}

}
