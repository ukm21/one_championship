package com.ukm;

public class FloorAccessEvent {
	String personId;
	String floorAccessDateTime;
	Integer floorLevel;
	String building;

	public FloorAccessEvent(String personId, String floorAccessDateTime, Integer floorLevel, String building) {
		this.personId = personId;
		this.floorAccessDateTime = floorAccessDateTime;
		this.floorLevel = floorLevel;
		this.building = building;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getFloorAccessDateTime() {
		return floorAccessDateTime;
	}

	public void setFloorAccessDateTime(String floorAccessDateTime) {
		this.floorAccessDateTime = floorAccessDateTime;
	}

	public Integer getFloorLevel() {
		return floorLevel;
	}

	public void setFloorLevel(Integer floorLevel) {
		this.floorLevel = floorLevel;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

}
