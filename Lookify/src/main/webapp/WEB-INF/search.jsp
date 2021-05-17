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
<p>Songs by artist: ${query }</p>
</div>
<div class="col">
	<form action="/search/${query }" method="post">
		<input type="text" id="query" name="query">
		<label for="search">New Search</label>
	<div class="col">
	<a href="/dashboard">Dashboard</a>
</div>
</form>
</div>
</div>
</div>

<table class="table table-dark">
		<thead>
			<tr>
				<th>Title</th>
				<th>Rating</th>
				<th>Action</th>
			</tr>
		</thead>
			<tbody>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td><a href="/song/${song.id}">${song.title }</a></td>
						<td>${song.rating }</td>
						<td>				
							<a href="/song/${song.id }/delete">Delete</a>
						</td>				
					</tr>
				</c:forEach>
			</tbody>

	</table>
</body>
</html>