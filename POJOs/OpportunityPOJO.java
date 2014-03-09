package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class OpportunityPOJO{
	
	private int id;
	private String name;
	private String description;
	private Date dateCreated;

	public OpportunityPOJO(){
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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date pDateCreated) {
		this.dateCreated = pDateCreated;
	}
	
}
