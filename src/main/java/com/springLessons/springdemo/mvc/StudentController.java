package com.springLessons.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;
	
	@RequestMapping("/showform")
	public String showForm(Model theModel)
	{
		//Add Student object to the model
		theModel.addAttribute("student", new Student());
		
		 // add the country options to the model 
	    theModel.addAttribute("theCountryOptions", countryOptions); 
	    
		return "student-form";
	}
	
	//@ModelAttribute to fetch the attribute name Student
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student")Student theStudent)
	{
		System.out.println(theStudent.getFirstName());
		System.out.println(theStudent.getCountry());
		return "student-confirmation";
	}
}
