package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class ContactRequestPOJO{
	
	private int id;
	private String subject;
	private String message;
	private Date dateSended;

	public ContactRequestPOJO() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int pId) {
		this.id = pId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String pSubject) {
		this.subject = pSubject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String pMessage) {
		this.message = pMessage;
	}

	public Date getDateSended() {
		return dateSended;
	}

	public void setDateSended(Date pDateSended) {
		this.dateSended = pDateSended;
	}

	
	
}
