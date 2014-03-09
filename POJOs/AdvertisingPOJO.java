package com.cenfotec.springdata.pojo;

import java.sql.Date;

public class AdvertisingPOJO {
	
	private int id;
	private String description;
	private String url;
	private boolean isActive;
	private Date startDate;
	private Date endDate;
	private boolean pendingPayment;
	private double pendingPaymentAmount;
	private double rate;

	public AdvertisingPOJO(){
		super();
	}

	public int getAdvertisingId() {
		return advertisingId;
	}
	public void setAdvertisingId(int pAdvertisingId) {
		this.advertisingId = pAdvertisingId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String pDescription) {
		this.description = pDescription;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String pUrl) {
		this.url = pUrl;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean pIsActive) {
		this.isActive = pIsActive;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date pStartDate) {
		this.startDate = pStartDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date pEndDate) {
		this.endDate = pEndDate;
	}
	public boolean isPendingPayment() {
		return pendingPayment;
	}
	public void setPendingPayment(boolean pPendingPayment) {
		this.pendingPayment = pPendingPayment;
	}
	public double getPendingPaymentAmount() {
		return pendingPaymentAmount;
	}
	public void setPendingPaymentAmount(double pPendingPaymentAmount) {
		this.pendingPaymentAmount = pPendingPaymentAmount;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double pRate) {
		this.rate = pRate;
	}
	
}
