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
	<tr><th><h1> Account Registration</h1></th>
	<th><h1> Login </h1></th>
	</tr>
	<tr>
	<td>
	
            <div class="col-md-4 me-5 border p-4 mt-4">
         
                <form:form action="/register" method="post" modelAttribute="newUser">

                    <form:label path="userName" for="floatingInput">User name:</form:label><br>
                    <form:input path="userName" type="text" class="form-control mt-4" placeholder="User name" /><br><br>
					<form:errors path="userName" style="color:red;"/>

					<form:label path="email" for="floatingInput">Email address</form:label><br>
                    <form:input path="email" type="text" class="form-control mt-4" placeholder="Email" /><br><br>
                    <form:errors path="email" style="color:red;" />

 					<form:label  path="password" for="floatingInput">Password</form:label><br>
                    <form:input path="password" type="password" class="form-control mt-4" placeholder="Password" /><br><br>
                   	<form:errors path="password" style="color:red;" />

                    <form:label  path="confirm" for="floatingInput"> Confirm Password</form:label><br>
                    <form:input path="confirm" type="password" class="form-control mt-4" placeholder="Confirm Passsword"/><br><br>
    				<form:errors path="confirm" style="color:red;" />
					
                    <div class="mt-4">
					<button type="submit" class="btn btn-success btn-sm">Register</button>
					</div>
                </form:form>
            </div>
		</td>
		<td>           
                <form:form action="/login" method="post" modelAttribute="newLogin">
                           
                    <form:label path="email" for="floatingInput">Email address:</form:label>   <br>          
                    <form:input path="email" type="text" class="form-control mt-4" placeholder="Email" /><br> <br>
                  	<form:errors path="email" style="color:red;" />
                    
                    <form:label  path="password" for="floatingInput">Password</form:label><br>
                    <form:input path="password" type="password" class="form-control mt-4" placeholder="Password" /><br> <br>
                    <form:errors path="password" style="color:red;" />
					<div class="mt-4">
					<button type="submit" class="btn btn-success btn-sm">Log in</button>
					</div>
                    
                </form:form>
       </td>
    </tr>
    
    </table>
</body>
</html>