package de.tum.in.dbpra.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;

import de.tum.in.dbpra.model.bean.CustomerBean;
import de.tum.in.dbpra.model.bean.OrderBean;
import de.tum.in.dbpra.model.dao.CustomerDAO.CustomerNotFoundException;

public class OrdersDAO extends DAO{
	
	public void getOrders(Stack<OrderBean> orders, String search) throws OrdersNotFoundException, SQLException, ClassNotFoundException 
	{
		
		String query = "SELECT * FROM orders WHERE orderstatus = ?;";
		
		Connection con = getConnection();
		con.setAutoCommit(false);
		
		PreparedStatement pstmt = con.prepareStatement(query);		
		pstmt.setFetchSize(0);
		pstmt.setString(1, search);
				
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			
			OrderBean order = new OrderBean();
			order.setOrderkey(rs.getInt("orderkey"));
			order.setCustkey(rs.getInt("custkey"));
			order.setOrderStatus(rs.getString("orderStatus"));
			order.setOrderDate(rs.getString("orderDate"));
			order.setTotalpricel(rs.getDouble("totalprice"));
			orders.push(order);
			}
	
		rs.close();
		pstmt.close();
		con.close();		
	}
	
	public static class OrdersNotFoundException extends Throwable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		OrdersNotFoundException(String message){
			super(message);
		}
	}

	public CustomerBean getUserByOrder(int orderkey) throws OrdersNotFoundException, SQLException, ClassNotFoundException  
	{
		
		String query = "SELECT custkey FROM orders WHERE orderkey = ?;";
		int custkey = 0;
		
		Connection con = getConnection();
		con.setAutoCommit(false);
		
		PreparedStatement pstmt = con.prepareStatement(query);		
		pstmt.setFetchSize(0);
		pstmt.setInt(1, orderkey);
				
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			custkey = rs.getInt("custkey");
		}
		
		query = "SELECT * FROM customer WHERE custkey = ?;";
				
		pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, custkey);
		
		rs = pstmt.executeQuery();
		
		CustomerBean customer = new CustomerBean();
		
		if(rs.next()) {
			customer.setName(rs.getString("name"));
			customer.setCustkey(rs.getInt("custkey"));
			customer.setAddress(rs.getString("address"));
			customer.setAcctbal(rs.getDouble("acctbal"));
		} else {
			throw new OrdersNotFoundException("There is no Customer with id " + orderkey + "!");
		}		
		
		return customer;
	}
	
	public Stack <String[]> getAllOrderData(int orderkey) throws OrdersNotFoundException, SQLException, ClassNotFoundException  
	{
		String query = "SELECT totalprice, orderdate, quantity, extendedprice, name, type, size, container, retailprice FROM orders "
				+ "JOIN lineitem ON orders.orderkey = lineitem.orderkey "
				+ "JOIN part ON lineitem.partkey = part.partkey "
				+ "WHERE orders.orderkey = ?;";
		
		Stack <String[]>  result = new Stack<>();
		
		Connection con = getConnection();
		con.setAutoCommit(false);
		
		PreparedStatement pstmt = con.prepareStatement(query);		
		pstmt.setFetchSize(0);
		pstmt.setInt(1, orderkey);
				
		ResultSet rs = pstmt.executeQuery();
				
		while(rs.next()) {			
			String[] temp = new String[8];
			temp[0] = rs.getString("quantity");
			temp[1] = rs.getString("extendedprice");
			temp[2] = rs.getString("size");
			temp[3] = rs.getString("container");
			temp[4] = rs.getString("retailprice");
			temp[5] = rs.getString("name");
			temp[6] = rs.getString("type");			
			temp[7] = rs.getString("orderdate");
			
			result.push(temp);
			}
		
		return result;		
	}
}
