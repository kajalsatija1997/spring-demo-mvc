<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>
Country: 
<form:select path="country">
<!-- Retrieved countries from properties file -->
<form:options items="${theCountryOptions}"></form:options> --%

<!-- Retrieved countries from java class -->
<%-- <form:options items="${student.countryOptions}"></form:options> --%>

<!-- Add harcoded options -->
<%-- <form:option value="France" label="France"></form:option>
<form:option value="India" label="India"></form:option>
<form:option value="Turkey" label="Turkey"></form:option>
<form:option value="UK" label="United Kingdom"></form:option>
<form:option value="US" label="United States"></form:option> --%>

</form:select>
<br><br>
<!-- Add harcoded radio buttons -->
Favourite Language:
<%-- C#<form:radiobutton path="favouriteLanguage" value="C#"/>
Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/>
PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>  --%>

<!-- Retrieved countries from java class -->
<form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}"  /> 

<br><br>
<!-- Add harcoded checkboxes-->
Operating Systems:
Linux<form:checkbox path="operatingSystem" value="Linux"/>
Mac OS<form:checkbox path="operatingSystem" value="Mac OS"/>
MS Windows<form:checkbox path="operatingSystem" value="MS Windows"/> 

<%-- <form:checkboxes items="${student.operatingSystemsOptions}" path="operatingSystem"/> --%>

<br><br>	

<input type="submit" value="Submit"/>
</form:form>
</body>
</html>