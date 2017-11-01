<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="checkStatus.fund">
<h1 align="center"><b>Check Status</b></h1>
<hr>
<table align="center" border="0">
<tr>
	<td><b>Complaint Id:</b></td>
	
	<td><input type="number" name="complaintId"/></td>
</tr>
<tr>
	<th colspan="2"><input type="submit" name="submit" value="Check Status"></input></th>
</tr>
</table>
<table align="center">
<tr>
<td>Complaint Id:	</td><td>Description:	</td><td>Status:	</td>
</tr>
<tr>
<td>${fund.complaintId}</td>
<td>${fund.desc}</td>
<td>${fund.status}</td>

</tr></table>



<a text-align="center" href="index.fund">Raise Complaint</a>
</form>
</body>
</html>