package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class RecentProfilePOJO{
	
	private int id;
	private Date dateTime;
	
	public RecentProfilePOJO(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int pId) {
		this.id = pId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date pDateTime) {
		this.dateTime = pDateTime;
	}

}
