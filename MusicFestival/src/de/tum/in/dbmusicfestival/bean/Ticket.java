package de.tum.in.dbmusicfestival.bean;

import java.sql.Date;

public class Ticket {
	private int ticketId;
	private int vId;
	private double balanceAmount;
	private Date ticketValidFrom;
	private Date ticketValidTo;
	private String ticketStatus;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public Date getTicketValidFrom() {
		return ticketValidFrom;
	}
	public void setTicketValidFrom(Date ticketValidFrom) {
		this.ticketValidFrom = ticketValidFrom;
	}
	public Date getTicketValidTo() {
		return ticketValidTo;
	}
	public void setTicketValidTo(Date ticketValidTo) {
		this.ticketValidTo = ticketValidTo;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
}
