<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
<H1>New Dojo</H1>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<form:form action="/dojos/create" method="post" modelAttribute="Dojo">

<p>
<form:label path="name">Name: </form:label>
<form:errors path="name"/>
<form:input path="name"/><br>
</p>
<input type="submit" value="Create"/>
</form:form>
</body>
</html>