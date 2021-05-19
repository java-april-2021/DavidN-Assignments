<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
</head>
<body>
<H1>Create A New Person</H1>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<form:form action="/persons/create" method="post" modelAttribute="Person">

<p>
<form:label path="firstName">First Name: </form:label>
<form:errors path="firstName"/>
<form:input path="firstName"/><br>
</p>
<p>
<form:label path="lastName">Last Name: </form:label>
<form:errors path="lastName"/>
<form:input path="lastName"/><br>
</p>
<input type="submit" value="Create"/>
</form:form>
</body>
</html>