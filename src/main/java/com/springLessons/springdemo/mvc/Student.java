package com.springLessons.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favouriteLanguageOptions;
	private LinkedHashMap<String, String> operatingSystemsOptions;

	private String favouriteLanguage;
	private String[] operatingSystem;


	public Student()
	{
		countryOptions=new LinkedHashMap<>();
		favouriteLanguageOptions=new LinkedHashMap<>();
		operatingSystemsOptions=new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("Ruby", "Ruby");
		favouriteLanguageOptions.put("PHP", "PHP");
		
		operatingSystemsOptions.put("Linux", "Linux");
		operatingSystemsOptions.put("Mac OS", "Mac OS");
		operatingSystemsOptions.put("MS Windows", "MS Windows");
	}
	
	
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
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public LinkedHashMap<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}
}
