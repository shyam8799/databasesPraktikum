package de.tum.in.dbmusicfestival.bean;

import java.sql.Date;
import java.sql.Time;

public class CanEnter {
	private int ticketId;
	private Date date;
	private Time lognTime;
	private Time logoutTime;
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
	public Time getLognTime() {
		return lognTime;
	}
	public void setLognTime(Time lognTime) {
		this.lognTime = lognTime;
	}
	public Time getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Time logoutTime) {
		this.logoutTime = logoutTime;
	}
	
}
