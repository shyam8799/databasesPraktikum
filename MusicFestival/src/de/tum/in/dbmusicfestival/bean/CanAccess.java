package de.tum.in.dbmusicfestival.bean;

import java.sql.Date;
import java.sql.Time;

public class CanAccess {
	private int stagingId;
	private int ticketId;
	private Date date;
	private Time loginTime;
	private int toWatchBand;
	private Time logoutTime;
	public int getStagingId() {
		return stagingId;
	}
	public void setStagingId(int stagingId) {
		this.stagingId = stagingId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Time loginTime) {
		this.loginTime = loginTime;
	}
	public int getToWatchBand() {
		return toWatchBand;
	}
	public void setToWatchBand(int toWatchBand) {
		this.toWatchBand = toWatchBand;
	}
	public Time getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Time logoutTime) {
		this.logoutTime = logoutTime;
	}
	
	
}
