<%@page import="org.dao.StudentsDAO"%>
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
	StudentsDAO dao  = new StudentsDAO(); 
	dao.deleteStudent(Integer.parseInt(request.getParameter("rollno"))); 
%>
</body>
</html>