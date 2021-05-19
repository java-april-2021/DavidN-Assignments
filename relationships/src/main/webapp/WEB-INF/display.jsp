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
<H1>${Person.firstName} ${Person.lastName}</H1>

<table>
	<tr>
		<td>License Number</td>
		<td>${License.number}</td>
	</tr>
	<tr>
		<td>State</td>
		<td>${License.state}</td>
	</tr>
	<tr>
		<td>Expiration Date: </td>
		<td>${License.expiration_date}</td>
	</tr>
</table>

</body>
</html>