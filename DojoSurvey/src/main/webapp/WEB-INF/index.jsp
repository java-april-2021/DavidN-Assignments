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
	<form method="POST" action="/result" class="survey">
		<label for="name">Your Name:</label>
  		<input type="text" id="name" name="name"><br>
		
		 <label for="location">Dojo Location:</label>
	
		<select name="location" id="location">
		  <option value="San Jose">San Jose</option>
		  <option value="Orange County">Orange County</option>
		</select> <br>
		
		<label for="language">Favorite Language:</label>
	
		<select name="language" id="language">
		  <option value="Python">Python</option>
		  <option value="Java">Java</option>
		</select> <br>
		
		<label for="comment">Comment (optional):</label><br>
  		<textarea name="comment" rows="5" cols="30"></textarea><br>
  		
		<input type="submit" value="Submit">
	</form>
</body>
</html>