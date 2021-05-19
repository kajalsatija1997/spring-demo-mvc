package com.springLessons.springdemo.mvc;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
public @interface CourseCode {
	
	//define default course code to check for Single prefix
	/* public String value() default "LPU"; */
	
	//To check for multiple prefixes
	public String[] value() default "LPU";
	
	//define default error message
	public String message() default "Course Code must Start with LPU";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {} ;
 
}
