package de.tum.in.dbmusicfestival.bean;

import java.sql.Timestamp;

public class Note {
	private int noId;
	private int rId;
	private String text;
	private Timestamp timestamp;
	
	public int getNoId() {
		return noId;
	}
	public void setNoId(int noId) {
		this.noId = noId;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
}
