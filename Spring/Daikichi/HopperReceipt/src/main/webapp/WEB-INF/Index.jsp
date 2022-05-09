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

<h1> Customer Name: <c:out value="${hname}"/> </h1>
<h3>Item Name: <c:out value="${hitemName}"/></h3>
<h3>Item Name: <c:out value="${hprice}"/></h3>
<h3>Item Name: <c:out value="${hdescription}"/></h3>
<h3>Item Name: <c:out value="${hvendor}"/></h3>



</body>
</html>