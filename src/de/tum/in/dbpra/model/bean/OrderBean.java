package de.tum.in.dbpra.model.bean;

public class OrderBean {
	
	private int orderkey;
	private int custkey;
	private String orderStatus;
	private double totalprice;
	private String orderDate;
	
	public OrderBean() {}
	
	
	public int getOrderkey() {
		return orderkey;
	}
	public void setOrderkey(int orderkey) {
		this.orderkey = orderkey;
	}
	
	public int getCustkey() {
		return custkey;
	}
	public void setCustkey(int custkey) {
		this.custkey = custkey;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public double getTotalprice() {
		return totalprice;
	}
	
	public void setTotalpricel(double totalprice) {
		this.totalprice = totalprice;
	}
	
}
