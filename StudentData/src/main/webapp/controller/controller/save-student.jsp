<%@page import="org.bean.Studentsbean"%>
<%@page import="org.dao.StudentsDAO"%>
<%@page import="org.bean.Studentsbean"%>
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
	StudentsDAO dao = new StudentsDAO();

   Studentsbean stdbean = new Studentsbean();
	
   stdbean.setRollNo(Integer.parseInt(request.getParameter("rollno"))); 
   stdbean.setName(request.getParameter("stdname")); 
   stdbean.setMarks(Integer.parseInt(request.getParameter("stdmarks"))); 
   dao.insertStudent(stdbean);
%>
</body>
</html>