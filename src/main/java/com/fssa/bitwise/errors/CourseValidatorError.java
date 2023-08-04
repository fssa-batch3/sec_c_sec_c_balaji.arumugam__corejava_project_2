package com.fssa.bitwise.errors;

public interface CourseValidatorError {

	public static final String INVALID_ERROR = "Class can't be null";

	public static final String INVALID_ID_NULL = "Course Id can't be null or Empty";

	public static final String INVALID_ID = "Course Id should contain minimum 2 characters and Maximum 50 characters";

	public static final String INVALID_NAME_NULL = "Course Name can't be null or Empty";

	public static final String INVALID_NAME = "Course Name should contain minimum 2 characters and Maximum 50 characters";

}
