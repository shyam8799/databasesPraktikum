package de.tum.in.dbmusicfestival.bean;

import java.sql.Date;

public class Works {
	private int shiftId;
	private int eId;
	private Date shiftDate;
	private int location;
	public int getShiftId() {
		return shiftId;
	}
	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public Date getShiftDate() {
		return shiftDate;
	}
	public void setShiftDate(Date shiftDate) {
		this.shiftDate = shiftDate;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	
}
