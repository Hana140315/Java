<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit Loop	</title>
</head>
<body>

 <h1>Fruit Name and it's Price</h1>
 <table class="table">
 	<tr> 
 		<th> Fruit Name</th>
 		<th> Price</th>
 	</tr>
	 	<c:forEach var="fruit" items="${Fruitcontroller}">
	 	<tr>
	 	  <td><c:out value="${fruit.name}"></c:out></td>
	 	   <td><c:out value="${fruit.price}"></c:out></td>
	 	  
 	 </tr>
 	 	</c:forEach>
 </table>
 
   
</body>
</html>