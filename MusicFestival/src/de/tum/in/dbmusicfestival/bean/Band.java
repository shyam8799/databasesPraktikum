package de.tum.in.dbmusicfestival.bean;

import java.sql.Timestamp;

public class Band {
	private int bId;
	private int prId;
	private int stageId;
	private int oId;
	private String name;
	private String manager;
	private Timestamp timeSlotStart;
	private Timestamp timeSlotEnd;
	private String pressInfo;
	private boolean accepted;
	private int shopId;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public int getStageId() {
		return stageId;
	}
	public void setStageId(int stageId) {
		this.stageId = stageId;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Timestamp getTimeSlotStart() {
		return timeSlotStart;
	}
	public void setTimeSlotStart(Timestamp timeSlotStart) {
		this.timeSlotStart = timeSlotStart;
	}
	public Timestamp getTimeSlotEnd() {
		return timeSlotEnd;
	}
	public void setTimeSlotEnd(Timestamp timeSlotEnd) {
		this.timeSlotEnd = timeSlotEnd;
	}
	public String getPressInfo() {
		return pressInfo;
	}
	public void setPressInfo(String pressInfo) {
		this.pressInfo = pressInfo;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	
}
