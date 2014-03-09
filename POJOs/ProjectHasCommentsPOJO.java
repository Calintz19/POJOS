package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class ProjectHasCommentsPOJO{
	
	private int id;
	private String comment;
	private Date dateInserted;
	private boolean isActive;

	public ProjectHasCommentsPOJO() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int pId) {
		this.id = pId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String pComment) {
		this.comment = pComment;
	}

	public Date getDateInserted() {
		return dateInserted;
	}

	public void setDateInserted(Date pDateInserted) {
		this.dateInserted = pDateInserted;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean pIsActive) {
		this.isActive = pIsActive;
	}

	
	
}
