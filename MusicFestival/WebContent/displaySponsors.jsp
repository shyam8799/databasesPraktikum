<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "de.tum.in.dbmusicfestival.bean.Sponsor" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Sponsors</title>
</head>
<body>
<% if (request.getAttribute("error") != null) { %>
	<h1>
	<%=request.getAttribute("error") %>
	</h1>
<% } else {%>

<%ArrayList<Sponsor> sponsors = (ArrayList<Sponsor>)request.getAttribute("sponsorspresent"); 
if(sponsors.size()!=0){
%>
<h4>Sponsors List</h4>
<table border="1">
	<tr>
		<th>Sponsor ID</th>
		<th>Name</th>
		<th>Address</th>
		<th>Phone</th>
		<th>Email</th>
	</tr>
	<%for(int i=0;i<sponsors.size();i++) {%>
	<tr>
		<td><%=sponsors.get(i).getSpId() %></td>
		<td><%=sponsors.get(i).getName() %> </td>
		<td><%=sponsors.get(i).getAddress() %></td>
		<td><%=sponsors.get(i).getPhone() %></td>
		<td><%=sponsors.get(i).getEmail() %> </td>
	</tr>
	<%} %>
</table>
<% } %>
<% } %>
<br/><br/>
</body>
</html>
