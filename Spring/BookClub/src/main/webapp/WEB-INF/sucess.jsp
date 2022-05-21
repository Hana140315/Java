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
			<h2>Welcome  <c:out value="${currentUser.userName}" /> You are successfully login</h2>
			<h5><a href="/logout" style="text-decoration: none;">Logout</a></h5>
			<h3>Books from everyone shelves: </h3> <a href="/books/new" style="text-decoration: none;">+ Add to my Shelf</a>
			</div>
			<table>
			<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Posted By</th>
			</tr>
			<c:forEach var="book" items="${allBooks}"> 
			<tr>
			<td><c:out value="${book.id }"/></td>
			<td><a href="/books/${book.id }"><c:out value="${book.title}"/> </a></td>
			<td><c:out value="${book.author }"/></td>
			<td><c:out value="${book.user.userName }"/></td>
			</tr>
			</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>