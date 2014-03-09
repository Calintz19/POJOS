package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class ProjectPOJO{
	
	private int id;
	private String name;
	private String description;
	private int pointsNeeded;
	private Date dateEnd;

	public ProjectPOJO(){
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int pId) {
		this.id = pId;
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
	public int getPointsNeeded() {
		return pointsNeeded;
	}
	public void setPointsNeeded(int pPointsNeeded) {
		this.pointsNeeded = pPointsNeeded;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date pDateEnd) {
		this.dateEnd = pDateEnd;
	}
	
}
