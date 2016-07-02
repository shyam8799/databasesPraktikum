<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "de.tum.in.dbmusicfestival.bean.Song" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Songs</title>
</head>
<body>
<% if (request.getAttribute("error") != null) { %>
	<h1>
	<%=request.getAttribute("error") %>
	</h1>
<% } else {%>

<%ArrayList<Song> songs = (ArrayList<Song>)request.getAttribute("songsplaying"); 
if(songs.size()!=0){
%>
<h4>Songs List</h4>
<table border="1">
	<tr>
		<th>Song ID</th>
		<th>Name</th>
		<th>Duration</th>
	</tr>
	<%for(int i=0;i<songs.size();i++) {%>
	<tr>
		<td><%=songs.get(i).getSoId() %></td>
		<td><%=songs.get(i).getSongName() %> </td>
		<td><%=songs.get(i).getDuration() %></td>
	</tr>
	<%} %>
</table>
<% } %>
<% } %>
<br/><br/>
</body>
</html>
