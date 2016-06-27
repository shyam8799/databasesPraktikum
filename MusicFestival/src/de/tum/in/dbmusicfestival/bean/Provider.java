package de.tum.in.dbmusicfestival.bean;

public class Provider {
	private int prid;
	private String name;
	private int numberOfBands;
	private int numberOfSponsors;
	
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfBands() {
		return numberOfBands;
	}
	public void setNumberOfBands(int numberOfBands) {
		this.numberOfBands = numberOfBands;
	}
	public int getNumberOfSponsors() {
		return numberOfSponsors;
	}
	public void setNumberOfSponsors(int numberOfSponsors) {
		this.numberOfSponsors = numberOfSponsors;
	}
	
}
