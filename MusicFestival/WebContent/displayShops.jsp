<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "de.tum.in.dbmusicfestival.bean.Shop" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Shops</title>
</head>
<body>
<% if (request.getAttribute("error") != null) { %>
	<h1>
	<%=request.getAttribute("error") %>
	</h1>
<% } else {%>

<%ArrayList<Shop> shops = (ArrayList<Shop>)request.getAttribute("shopsavailable"); 
if(shops.size()!=0){
%>
<h4>Shops List</h4>
<table border="1">
	<tr>
		<th>Shop ID</th>
		<th>Name</th>
		<th>Owner Type</th>
	</tr>
	<%for(int i=0;i<shops.size();i++) {%>
	<tr>
		<td><%=shops.get(i).getShopId() %></td>
		<td><%=shops.get(i).getName() %> </td>
		<td><%=shops.get(i).getOwnerType() %></td>
	</tr>
	<%} %>
</table>
<% } %>
<% } %>
<br/><br/>
</body>
</html>
