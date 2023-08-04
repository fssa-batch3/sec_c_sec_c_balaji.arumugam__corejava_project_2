package com.fssa.bitwise.model;

import java.time.LocalDate;
import java.util.Objects;

public class Course {

	private String courseid;
	private String courseName;
	private String courseImageUrl;
	private String submodule;
	private String author;
	private LocalDate courseCreationDate;
	private LocalDate courseUpdatedDate;

	public Course(String courseid, String coursename, String courseImageUrl, String submodule, String author,
			LocalDate courseCreationDate, LocalDate courseUpdatedDate) {
		super();
		this.courseid = courseid;
		this.courseName = coursename;
		this.courseImageUrl = courseImageUrl;
		this.submodule = submodule;
		this.author = author;
		this.courseCreationDate = courseCreationDate;
		this.courseUpdatedDate = courseUpdatedDate;
	}

	

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String coursename) {
		this.courseName = coursename;
	}

	public String getCourseImageUrl() {
		return courseImageUrl;
	}

	public void setCourseImageUrl(String courseImageUrl) {
		this.courseImageUrl = courseImageUrl;
	}

	public String getSubmodule() {
		return submodule;
	}

	public void setSubmodule(String submodule) {
		this.submodule = submodule;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getCourseCreationDate() {
		return courseCreationDate;
	}

	public void setCourseCreationDate(LocalDate courseCreationDate) {
		this.courseCreationDate = courseCreationDate;
	}

	public LocalDate getCourseUpdatedDate() {
		return courseUpdatedDate;
	}

	public void setCourseUpdatedDate(LocalDate courseUpdatedDate) {
		this.courseUpdatedDate = courseUpdatedDate;
	}
}
