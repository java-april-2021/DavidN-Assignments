<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify</title>
</head>
<body>
<%-- <form action="/song/new/add"> --%>
<!-- 	<label for="title">Title</label> -->
<!-- 	<input type="text" id="title" name="title"><br> -->
<!-- 	<label for="artist">Artist</label> -->
<!-- 	<input type="text" id="artist" name="artist"> -->
<!-- 	<label for="rating">Rating</label> -->
<!-- 	<input type="text" id="rating" name="rating"> -->
<!-- 	<input type="submit" value="Add Song">	 -->
<%-- </form> --%>

<div class="col-md-6 form-group ${requestScope['org.springframework.validation.BindingResult.obj'].hasFieldErrors()}">
<form:form method="POST" action="/song/new/add" modelAttribute="Song">
    <form:label path="title">Title
    <form:errors path="title"/>
    <form:input path="title"/></form:label>
    
    <form:label path="artist">Artist
    <form:errors path="artist"/>
    <form:input path="artist"/></form:label>
    
    <form:label path="rating">Rating
    <form:errors path="rating"/>     
    <form:input type="number" path="rating"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>