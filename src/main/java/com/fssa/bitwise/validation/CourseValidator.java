package com.fssa.bitwise.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fssa.bitwise.errors.CourseValidatorError;
import com.fssa.bitwise.model.Course;

public class CourseValidator {

	public static boolean Validate(Course course) throws Exception {

		if (course == null) {
			throw new Exception(CourseValidatorError.INVALID_ERROR);
		}

		return true;
	}

	public static boolean validateCourseId(String courseId) throws Exception {
		if (courseId == null || "".equals(courseId)) {

			throw new Exception(CourseValidatorError.INVALID_ID_NULL);
		}

		String regex = "^(?=.*[a-zA-Z0-9])[a-zA-Z0-9!@#$%^&*()_+{}\\[\\]:;<>,.?/~`|\\\\-]{2,50}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(courseId);
		boolean isMatch = match.matches();

		if (!isMatch) {

			throw new Exception(CourseValidatorError.INVALID_ID);
		}

		return true;
	}

	public static boolean validateCourseName(String name) throws Exception {
		if (name == null || "".equals(name)) {

			throw new Exception(CourseValidatorError.INVALID_NAME_NULL);
		}

		String regex = "^[A-Za-z]{1,50}$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(name);
		boolean isMatch = match.matches();

		if (!isMatch) {

			throw new Exception(CourseValidatorError.INVALID_NAME);
		}

		return true;
	}

}
