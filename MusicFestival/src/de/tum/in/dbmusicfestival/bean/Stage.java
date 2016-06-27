package de.tum.in.dbmusicfestival.bean;

public class Stage {
	private int stageId;
	private int manager;
	private int stagingId;
	private String name;
	private int size;
	private String location;
	
	public int getStageId() {
		return stageId;
	}
	public void setStageId(int stageId) {
		this.stageId = stageId;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public int getStagingId() {
		return stagingId;
	}
	public void setStagingId(int stagingId) {
		this.stagingId = stagingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
