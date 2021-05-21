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
<H1>New Person</H1>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<form:form action="/ninjas/create" method="post" modelAttribute="Ninja">

		<form:label path="dojo">Dojo: </form:label>
    	<form:select path = "dojo">
    	<c:forEach items="${ Dojos }" var="d">
       		<form:option value="${ d.id }">${ d.name }</form:option>
       </c:forEach>
    </form:select> 
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
	<p>
		<form:label path="age">Age: </form:label>
		<form:errors path="age"/>
		<form:input path="age"/><br>
	</p>
<input type="submit" value="Create"/>
</form:form>
</body>
</html>