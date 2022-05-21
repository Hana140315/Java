<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Registration Form</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>

<body>
	<table>
		<tr>
			<th><h1> Add a Book to your Shelf!</h1></th>
			<th><a href="sucess" style="text-decoration: none;"> back to the shelves</a></th>
		</tr>
		<tr>
			<td colspan="2"> <h3> Author must not be Blank</h3></td>
		</tr>
		<tr>
			<th> <form:form action="/edit" method="post" modelAttribute="newBook">
	
	                    <form:label path="title" for="floatingInput">Title:</form:label><br>
	                    <form:input path="title" type="text" class="form-control mt-4" placeholder="Title" /><br><br>
						<form:errors path="title"  style="color:red;"/>
	
						<form:label path="author" for="floatingInput">Author:</form:label><br>
	                    <form:input path="author" type="text" class="form-control mt-4" placeholder="Auhtor" /><br><br>
						<form:errors path="authore" style="color:red;"/>
	
	 					<form:label path="thought" for="floatingInput">Thought:</form:label><br>
	                    <form:input path="thought" type="text" class="form-control mt-4" placeholder="Thought" /><br><br>
						<form:errors path="thought" style="color:red;"/>
						
	                    <div class="mt-4">
						<button type="submit" class="btn btn-success btn-sm">Submit</button>
						</div>
	                </form:form>
	          </th>
	     </tr>
		
	</table>

</body>
</html>