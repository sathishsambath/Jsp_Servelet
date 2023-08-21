<%@page import="org.dao.StudentsDAO"%>
<%@page import="org.bean.Studentsbean"%>

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
		//getstudent(Integer.parseInt(request.getParameter("rollno")));
		Studentsbean student = new StudentsDAO().getstudent(Integer.parseInt(request.getParameter("rollno")));
	%>
	
	
	<table border="1"> 
		<tr>
			<td>Roll No </td>
			<td><%=student.getRollNo() %></td>
		</tr>
		<tr>
			<td>Student Name </td>
			<td><%= student.getName() %></td>
		</tr>
		<tr>
			<td>Student Marks</td>
			<td><%=student.getMarks() %></td>
		</tr>
		
	</table>
</body>
</html>