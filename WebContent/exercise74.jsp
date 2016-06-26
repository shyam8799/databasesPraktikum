<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<jsp:useBean id="customer" scope="request" class="de.tum.in.dbpra.model.bean.CustomerBean"></jsp:useBean>
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Invoice Data</title>
</head>
<body>
	<% if (request.getAttribute("error") != null) { %>
	<h1>Customer not found!</h1>
	<%= request.getAttribute("error") %>

	<% } else { %>

		<a href="../orders">BACK</a>


		<% String orderid = (String) request.getAttribute("orderid");%>		

		<h1>Order ID : <%= orderid %></h1>
	
	<div>
		<h2><%= customer.getName() %></h2>
	Customer ID: <%= customer.getCustkey() %> <br/>
	Address: <%= customer.getAddress() %> <br/>
	Balance: <%= customer.getAcctbal() %> <br/>
        	<% } %>
	</div>
	<div>
	<% String[][] orderData = (String[][]) request.getAttribute("allData");%>
				<table border="1" style="width:100%">
					<h3> Order Data</h3>
					
					<tr>
			        			
  				        <td><strong>Quantity</strong></td>
  				     	<td><strong>Extended Price</strong></td>
  				     	<td><strong>Size</strong></td>
  				     	<td><strong>Container</strong></td>  	
	  				    <td><strong>Retail Price </strong></td>
	  				    <td><strong>Name</strong></td>
	  				    <td><strong>Type</strong></td>
	  				    <td><strong>Order Date</strong></td>		  				    
		  				     				        			
	        		</tr>	
				
				<% for(String[] orderRow : orderData){ %>
					
					<tr>
			        			
  				        <td><%=  orderRow[0]  %> </td>
  				     	<td><%=  orderRow[1]  %></td>
  				     	<td><%=  orderRow[2]  %></td>
  				     	<td><%=  orderRow[3]  %> </td>  	
	  				    <td><%=  orderRow[4]  %> </td>
	  				    <td><%=  orderRow[5]  %> </td>
	  				    <td><%= orderRow[6]  %> </td>
	  				    <td><%= orderRow[7]  %> </td>		  				    
		  				     				        			
	        		</tr>	
				<% } %>	
					</table>
			    <% Double total = (Double) request.getAttribute("total");%>    	
			    
			    <h2>TOTAL : <%=total %></h2>
			     	
			        
	</div>
        
</body>
</html>