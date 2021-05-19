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
<form:form action="/licenses/create" method="post" modelAttribute="License">
		<form:label path="person">Person: </form:label>
    	<form:select path = "person">
    	<c:forEach items="${ Persons }" var="p">
       		<form:option value="${ p.id }">${ p.firstName } ${ p.lastName }</form:option>
       </c:forEach>
    </form:select> 
	<p>
		<form:label path="state">State: </form:label>
		<form:errors path="state"/>
		<form:input path="state"/><br>
	</p>
	<p>
		<form:label path="expiration_date">Expiration Date: </form:label>
		<form:errors path="expiration_date"/>
		<form:input type="date" class="form-control" path="expiration_date"/><br>
	</p>
<input type="submit" value="Create"/>
</form:form>
</body>
</html>