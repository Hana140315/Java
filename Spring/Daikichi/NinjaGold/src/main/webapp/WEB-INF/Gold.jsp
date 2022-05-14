<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Ninja Gold Game</h1>
	<h1> Your Gold:${gold}</h1>
	
	<div class= "wrapper">
			<div class="loc">
			<h1>Farm</h1>
				<h2>(earns 10 -20 gold)</h2>
				<form action='/farm' method='post'>
					<input name= 'farm' type='submit' value='Find Gold'>
				</form>
			</div>
			<div class="loc">
				<h1>Cave</h1>
			<h2>(earns 5 -10 gold)</h2>
			<form action='/cave' method='post'>
				<input name= 'cave' type='submit' value='Find Gold'>
			</form>
		</div>
		<div class= "loc">
			<h1>House</h1>
			<h2>(earns 2 -5 gold)</h2>
			<form action='/house' method='post'>
				<input name= 'house' type='submit' value='Find Gold'>
			</form>
		</div>  

		<div class= "loc">
				<h1>Quest</h1>
				<h2>(earns/takes 0 -50 gold)</h2>
				<form action='/quest' method='post'>
					<input name= 'quest' type='submit' value='Find Gold'>
				</form>
			</div>
			
	<div class="act">
	<c:forEach var="act" items="${activities}">
	
	<h1><c:out value="${act}"/></h1>
	
	</c:forEach>
	</div>
	</div>
	
	
</body>
</html>