<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="/css/style.css">
 <script type="text/javascript" src="js/date.js"></script>
<title>Insert title here</title>
</head>
<body>

<h1>Send An Omikuji !</h1>
    <form action='/enteromikuji' method='post'>
		<label class="form-label">Pick and number from  to 25 :</label><br><br>
    	<input type="text" name='number'><br><br>
		<label>Enter the name of any city:</label><br><br>
    	<input type='text' name='city'><br><br>
    	<label>Enter the name of any real person:</label><br><br>
    	<input type='text' name='person'><br><br>
    	<label>Enter professional endeavor or hobby:</label><br><br>
    	<input type='text' name='hobby'><br><br>
    	<label>Enter type of living thing:</label><br><br>
    	<input type='text' name='living'><br><br>
    	<label>Say something nice to someone:</label><br><br>
    	<textarea id="nice" name="nice" rows="4" cols="50">Say something nice to someone</textarea><br><br>
    	<label>Send and show a friend</label>
    	<input type='submit' value='Send'>
    </form>

</body>
</html>