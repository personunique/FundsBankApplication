<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fund complaint</title>
<link href="myCss.css" rel="stylesheet">
</head>
<body>
<h1 align="center" style="font-style:italic">Customer Complaint Request Form</h1>
	<hr>
<form:form action = "start.fund" commandname="bean" method="POST" modelAttribute="bean">
	
		<table align="center" border="0">
		<tr>
			<td>Account Id:*</td>
			<td>
				<form:input path="accountId"/></td>
				<td style="color:red">				
				<form:errors path="accountId"/>
			</td>
		</tr>
		
		<tr>
			<td>Branch Code:*</td>
			<td>
				<form:input path="branchCode"/>
				<td style="color:red">
				<form:errors path="branchCode"/>
			</td>
		</tr>
		
		<tr>
			<td>Email Id:*</td>
			<td>
				<form:input path="emailId"/>
				<td style="color:red">
				<form:errors path="emailId"/>
			</td>
		</tr>
		
		<tr>
			<td>Complaint Category:*</td>
			<td>
			
			<form:select path="compCat" name="ddlname" style="width:100px">
				<option>Select</option>
				<option value="Internet Banking">
				Internet Banking</option>
				<option value="General Banking">
				General Banking</option>
				<option value="Others">
				Others</option>
		</form:select>
		<td style="color:red">
		<form:errors path="compCat"/>
			</td>
		</tr>
		
		<tr>
			<td>Description:*</td>
			<td><form:textarea  
			path="desc" rows="5" cols="15"></form:textarea>
			<td style="color:red">
			<form:errors path="desc"/>
			</td>
		</tr>
		
		<tr>
			<th colspan="2"><input type="submit" name="submit" value="Register"
				></input></th>
		</tr>
		<tr>
			<th colspan="2"><a href="status.fund">Check Status</a>
				</th>
		</tr>
		
		</table>
	</form:form>
	
</body>
</html>