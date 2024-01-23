<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h2>Blue Archive</h2>
	<%="Chao JSP" %>
	<br>
	<%
		Date d = new Date();
		out.print(d.toString());
	%>
</body>
</html>