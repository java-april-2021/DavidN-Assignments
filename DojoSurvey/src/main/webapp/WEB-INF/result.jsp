<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h3>Submitted Info</h3>
	<div class="subtxt">
		<p>Name:</p>
		<p>Dojo Location:</p>
		<p>Favorite Language:</p>
		<p>Comment:</p>
	</div>
	<div class="subtxt">
		<p><c:out value="${name }"/></p>
		<p><c:out value="${location }"/></p>
		<p><c:out value="${language }"/></p>
		<p><c:out value="${comment }"/></p>
	</div>
</body>
</html>