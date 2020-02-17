package com.prestotc.dto;

public class SpecimenDTO {
	/*
	 * This is all for example right now, so I can understand the objective, in relation to the plantplaces example. 
	 */

	private int specimentID;
	private String latitude;
	private String longitude;
	public int getSpecimentID() {
		return specimentID;
	}
	public void setSpecimentID(int specimentID) {
		this.specimentID = specimentID;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
