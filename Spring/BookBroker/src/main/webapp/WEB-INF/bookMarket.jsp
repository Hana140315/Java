<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Login</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container-sm mt-3">
		<div class="row justify-content-center">
			<div class="col-md-10">
			<h2>Hello,<c:out value="${currentUser.userName}" />,  Welcome to</h2>
			<h5><a href="/books" style="text-decoration: none;">back to the shelves</a></h5>
			<h1>The Book Broker!</h1>
			<h3>Available Books to be Borrow </h3>
			
			</div>
			<table class="table">
			<tr class="table-active">
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Owner</th>
			<th>Actions</th>
			
			</tr>
			<c:forEach var="book" items="${allBooks}"> 
			<tr>
			<td><c:out value="${book.id }"/></td>
			<td><a href="/books/${book.id }"><c:out value="${book.title}"/> </a></td>
			<td><c:out value="${book.author }"/></td>
			<td><c:out value="${book.user.userName }"/></td>
			<td><a href="/edit/${book.id }">edit </a><a href="/delete/${book.id }">delete </a><a href="/borrow/${book.id }">borrow </a></td>
			</tr>
			</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>