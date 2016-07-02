<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "de.tum.in.dbmusicfestival.bean.Item" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Items</title>
</head>
<body>
<% if (request.getAttribute("error") != null) { %>
	<h1>
	<%=request.getAttribute("error") %>
	</h1>
<% } else {%>

<%ArrayList<Item> items = (ArrayList<Item>)request.getAttribute("itemslist"); 
if(items.size()!=0){
%>
<h4>Items List</h4>
<table border="1">
	<tr>
		<th>Item ID</th>
		<th>OID</th>
		<th>Name</th>
		<th>Type</th>
		<th>Price</th>
		<th>Stock</th>
	</tr>
	<%for(int i=0;i<items.size();i++) {%>
	<tr>
		<td><%=items.get(i).getItemId() %></td>
		<td><%=items.get(i).getoId() %> </td>
		<td><%=items.get(i).getName() %></td>
		<td><%=items.get(i).getType() %></td>
		<td><%=items.get(i).getPrice() %></td>
		<td><%=items.get(i).getStock() %></td>
	</tr>
	<%} %>
</table>
<% } %>
<% } %>
<br/><br/>
</body>
</html>
