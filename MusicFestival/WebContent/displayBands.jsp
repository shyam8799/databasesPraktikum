<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "de.tum.in.dbmusicfestival.bean.Band" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bands Playing</title>
</head>
<body>
<% if (request.getAttribute("error") != null) { %>
	<h1>
	<%=request.getAttribute("error") %>
	</h1>
<% } else {%>

<%ArrayList<Band> bands = (ArrayList<Band>)request.getAttribute("bandsplaying"); 
if(bands.size()!=0){
%>
<h4>Bands Playing</h4>
<table border="1">
	<tr>
		<th>Band ID</th>
		<th>Name</th>
		<th>Band Manager</th>
		<th>Time Slot Start</th>
		<th>Time Slot End</th>
		<th>Press Information</th>
	</tr>
	<%for(int i=0;i<bands.size();i++) {%>
	<tr>
		<td><%=bands.get(i).getbId() %></td>
		<td><%=bands.get(i).getName() %> </td>
		<td><%=bands.get(i).getManager() %></td>
		<td><%=bands.get(i).getTimeSlotStart() %></td>
		<td><%=bands.get(i).getTimeSlotEnd() %> </td>
		<td><%=bands.get(i).getPressInfo()%></td>
	</tr>
	<%} %>
</table>
<% } %>
<% } %>
<br/><br/>
</body>
</html>