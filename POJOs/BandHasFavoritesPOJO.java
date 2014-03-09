package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class BandHasFavoritesPOJO{
	
	private Date dateScored;
	private boolean isActive;

	public BandHasFavoritesPOJO() {
		super();
	}

	public Date getDateScored() {
		return dateScored;
	}

	public void setDateScored(Date pDateScored) {
		this.dateScored = pDateScored;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean pIsActive) {
		this.isActive = pIsActive;
	}

	
	
}
