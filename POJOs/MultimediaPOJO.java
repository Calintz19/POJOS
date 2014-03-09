package com.cenfotec.stretto.pojo;

public class MultimediaPOJO{
	
	private int id;
	private String name;
	private String description;
	private String url;
	private double singlePrice;

	public MultimediaPOJO(){
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String pUrl) {
		this.url = pUrl;
	}

	public double getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(double pSinglePrice) {
		this.singlePrice = pSinglePrice;
	}
	
}
