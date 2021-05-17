<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style type="text/css">
.error
{
color:red
}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
<i>Fill out the form. Asterik(*) means required.</i>
<br>
<br>
First Name: <form:input path="firstName"/>
<br><br>
Last Name(*):<form:input path="lastName"/>
<!-- Using Hibernate Validator for the validations -->
<form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
Free Passes: <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"></form:errors>
<br><br>
Postal Code: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"></form:errors>
<br><br>
<input type="submit" value="Submit">
</form:form>
</body>
</html>