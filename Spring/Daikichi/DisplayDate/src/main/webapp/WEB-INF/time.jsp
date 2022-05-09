<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
 <script type="text/javascript" src="js/date.js"></script>
</head>
<body>
<h2 > The time is: <%= new Date().getHours()-12  %>  pm</h2>
</body>
</html>