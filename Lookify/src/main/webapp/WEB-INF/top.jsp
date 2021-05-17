<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

</head>
<body>

<div class="container">
<div class="row">
<div class="col">
<p>Top Ten Songs: </p>
</div>
	<div class="col">
	<a href="/dashboard">Dashboard</a>
</div>
</div>
</div>

<table class="table table-dark">
		<thead>
			<tr>
				<th>Title</th>
				<th>Rating</th>
				<th>Artist</th>
			</tr>
		</thead>
			<tbody>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td><a href="/song/${song.id}">${song.title }</a></td>
						<td>${song.rating }</td>
						<td>${song.artist }</td>		
					</tr>
				</c:forEach>
			</tbody>

	</table>
</body>
</html>