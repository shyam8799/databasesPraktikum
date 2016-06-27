package de.tum.in.dbmusicfestival.bean;

public class Tent {
	private int tentId;
	private int supervisor;
	private int cId;
	private String name;
	private int capacity;
	public int getTentId() {
		return tentId;
	}
	public void setTentId(int tentId) {
		this.tentId = tentId;
	}
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
