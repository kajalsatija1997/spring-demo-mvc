package com.springLessons.springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	//For single prefix to be validated
	/* public String coursePrefix; */
	
	//For multiple prefix to be validated
	public String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode)
	{
		coursePrefix=theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		//For single prefix to be validated
		/* boolean result; */
		
		//For multiple prefix to be validated
		boolean result=false;
		
		//If not mention Null pointer exception on web page load
		if(theCode!=null)
		{
			//For single prefix to be validated
			/* result=theCode.startsWith(coursePrefix); */
			
			//For multiple prefix to be validated
			 //
            // loop thru course prefixes
            //
            // check to see if code matches any of the course prefixes
            //
			for(String temp:coursePrefix)
			{
				result=theCode.startsWith(temp);
				
				// if we found a match then break out of the loop
				if(result)
				{
					break;
				}
			}
		}
		else
		{
			result=true;
		}
		return result;
	}

}
