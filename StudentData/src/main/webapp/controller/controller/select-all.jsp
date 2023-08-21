<%@page import="org.dao.StudentsDAO"%>
<%@page import="org.bean.Studentsbean"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Roll No</td>
			<td>Student Name</td>
			<td>Student Marks</td>
			
			
		</tr>
		<%
			List<Studentsbean> list = new StudentsDAO().getStudents();

			for (Studentsbean std : list) {
		%>
		<tr>
			<td><%=std.getRollNo()%></td>
			<td><%=std.getName()%></td>
			<td><%=std.getMarks()%></td>
			
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>