<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="de.tum.in.dbpra.model.bean.OrderBean" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer</title>
</head>
<body>
	<% if (request.getAttribute("error") != null) { %>
	<h1>Orders not found!</h1>
	<%= request.getAttribute("error") %>

	<% } else { %>
	
		<% OrderBean[] orders = (OrderBean[]) request.getAttribute("ordersNo");%>
		
		<a href="./exercise71.html">BACK</a>
		
        		<table border="1" style="width:50%">
					<h3> Orders NO</h3>
							
						<% for(OrderBean order : orders){ %>
					
			        		<tr>
			        			<td><a href="./invoices/<%=order.getOrderkey() %>"><%= order.getOrderkey() %></a></td>
		  				        <td>Customer key: <%= order.getCustkey() %> </td>
		  				     	<td>Order status: <%= order.getOrderStatus() %></td>
		  				     	<td>Order date: <%= order.getOrderDate() %></td>
		  				     	<td>Order total: <%= order.getTotalprice() %> </td>  				        			
			        		</tr>	
			        	<% } %>		        		
        		</table>
        		
      		<% orders = (OrderBean[]) request.getAttribute("ordersOk");%>
        
        		<table border="1" style="width:50%">
					<h3> Orders OK</h3>
							
						<% for(OrderBean order : orders){ %>
					
			        		<tr>
			        			<td><a href="./invoices/<%=order.getOrderkey() %>"><%= order.getOrderkey() %></a></td>
		  				        <td>Customer key: <%= order.getCustkey() %> </td>
		  				     	<td>Order status: <%= order.getOrderStatus() %></td>
		  				     	<td>Order date: <%= order.getOrderDate() %></td>
		  				     	<td>Order total: <%= order.getTotalprice() %> </td>  				        			
			        		</tr>	
			        	<% } %>		        		
        		</table>
        			
	
        	<% } %>
	
</body>
</html>