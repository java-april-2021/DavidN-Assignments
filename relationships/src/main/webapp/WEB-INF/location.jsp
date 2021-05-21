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
<H1>${Dojo.name} Location Ninjas</H1>

<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
	</tr>
	<c:forEach items="${ Ninjas }" var="n">
	<tr>
		<td>${n.firstName}</td>
		<td>${n.lastName}</td>
		<td>${n.age }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>