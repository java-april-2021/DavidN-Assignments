<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p><c:out value="${errors}"/></p>
	<h3>What is the code?</h3>
	<form method="POST" action="/check">
		<input type="text" id="password" name="password"><br>
		<input type="submit" value="Try Code">
	</form>
</body>
</html> 