<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output Page</title>
</head>
<body>
Hello World Of Spring!

<br><br>

<!-- Fetching the value from another view using the name  -->
<%-- Student Name: ${param.studentName}  --%>
Student Name: ${message}
</body>
</html>