package com.springLessons.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	@NotNull(message="Last Name is required.")
	@Size(min=1,message="Last Name is required.")
	private String lastName;
	
	@NotNull(message="Free passes field is required.")
	@Min(value=0,message="Free Passes must be greater than or equal to 0")
	@Max(value=10,message="Free passes must be less than or equal to 10")
	//Change int to Integer to avoid Type conversion isssue 
	/* private int freePasses; */
	private Integer freePasses;
	
	@Pattern(regexp="[a-zA-Z0-9]{5}",message="Postal Code must be 5 digits/Chars")
	private String postalCode;
	
	//Our custom annotation @CourseCode is same as @CourseCode(value="LPU",message="must start with LPU") for single value or prefix to be checked
	//For more than one prefix to be checked
	@CourseCode(value= {"LPU","TOPS"},message="Course Code must start with LPU and TOPS")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
