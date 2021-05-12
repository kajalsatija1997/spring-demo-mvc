package com.springLessons.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest http, Model model)
	{

		//Read the request parameter from HTML form
		String theName=http.getParameter("studentName");
		
		//Convert the data to Capital letters
		theName=theName.toUpperCase();
		
		//Create the message 
		String result="Yo! "+theName;
		
		//Add Message to the model
		model.addAttribute("message",result);
		
		//Return the view
		return "helloworld";
	}
}
