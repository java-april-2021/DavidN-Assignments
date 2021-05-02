<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
</head>
<body onload="alertPage('<c:out value="${date}"/>')">
	<h1>Date or Time</h1>
	<h3><c:out value="${date}"/></h3>
</body>
</html>