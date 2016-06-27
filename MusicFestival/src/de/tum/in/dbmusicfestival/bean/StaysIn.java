package de.tum.in.dbmusicfestival.bean;

import java.sql.Date;
import java.sql.Time;

public class StaysIn {
	private int vId;
	private int tentId;
	private Time checkInTime;
	private Time checkOutTime;
	private Date checkInDate;
	private Date checkOutDate;
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public int getTentId() {
		return tentId;
	}
	public void setTentId(int tentId) {
		this.tentId = tentId;
	}
	public Time getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(Time checkInTime) {
		this.checkInTime = checkInTime;
	}
	public Time getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(Time checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
}
