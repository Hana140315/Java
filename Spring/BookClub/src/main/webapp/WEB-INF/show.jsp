<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Book Details </title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<table>
		<tr>
			<th><h1><c:out value="${book.title }"/></h1></th>
			<th> <a href="/sucess" style="text-decoration: none;">back to shelf</a>" </th>
		</tr>
		<tr>
			<td colspan="2"><h1><c:out value="${user.username }"/> read <c:out value="${book.title }"/> by <c:out value="${book.author}"/></h1> </td>
			<td colspan="2"><h2>Here are Bella's thoughts:</h2></td>
			<td colspan="2"><p> <c:out value="${book.thought }"/></p></td>
		</tr>
		
</table>

</body>
</html>