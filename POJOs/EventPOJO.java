package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class EventPOJO{
	
	private int id;
	private String name;
	private String description;
	private String place;
	private Date date;
	private String wazeUrl;
	
	public EventPOJO() {
		super();
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int pEventId) {
		this.eventId = pEventId;
	}
	public String getName() {
		return name;
	}
	public void setName(String pName) {
		this.name = pName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String pDescription) {
		this.description = pDescription;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String pPlace) {
		this.place = pPlace;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date pDate) {
		this.date = pDate;
	}
	public String getWazeUrl() {
		return wazeUrl;
	}
	public void setWazeUrl(String pWazeUrl) {
		this.wazeUrl = pWazeUrl;
	}
	
}
