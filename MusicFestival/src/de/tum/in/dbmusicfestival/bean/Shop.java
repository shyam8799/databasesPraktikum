package de.tum.in.dbmusicfestival.bean;

public class Shop {
	private int shopId;
	private String name;
	private String area;
	private char ownerType;
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public char getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(char ownerType) {
		this.ownerType = ownerType;
	}
	
	
}
