<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Insert Form </h1>
<form action="./controller/controller/save-student.jsp">
<table border="1">
	<tr>
		<td>Enter student roll </td>
		<td><input type="text" name="rollno" /></td>
	</tr>
	<tr>
		<td>Enter student Name </td>
		<td><input type="text" name="stdname" /></td>
	</tr>
	<tr>
		<td>student marks</td>
		<td><input type="text" name="stdmarks" /></td>
	</tr>
	<tr>
		<td><input type="reset" /></td>
		<td><input type="submit" value="Save" /></td>
	</tr>
	

</table>

</form>
</body>
</html>