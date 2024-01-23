<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String tenDN = request.getParameter("username");
    	String mk = request.getParameter("password");
		if(tenDN.equals("ABC")&& mk.equals("MKK"))
			response.sendRedirect("UserProfile.html");
		else
			response.sendRedirect("Login.html");
	%>
</body>
</html>