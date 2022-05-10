<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Here's your Omikuji !</h1>
	<h3> In <c:out value="${number}"/> years, you will be live in<c:out value=" ${city }"/> with <c:out value="${person}"/> as roommate,<c:out value=" ${hobby}"/>
	 for living. </h3>
	<h3>The next time you see a <c:out value=" ${living }"/>, you will have a good luck. Also,<c:out value=" ${nice}"/> </h3>
	
	<a href="/omikuji"> Go Back</a>
</body>
</html>