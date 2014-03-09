package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class AccountPOJO{
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String twitterEmail;
	private String facebookEmail;
	private String password;
	private String imageUrl;
	private Date dateOfBirth;
	private String phone;
	private String address;
	private int sex;
	private String quote;
	private String professionalDegree;
	private String company;
	private String webPageUrl;
	private String influences;
	private String interests;
	private String biography;
	
	public AccountPOJO(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int pId) {
		this.id = pId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String pFirstName) {
		this.firstName = pFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String pLastName) {
		this.lastName = pLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String pEmail) {
		this.email = pEmail;
	}

	public String getTwitterEmail() {
		return twitterEmail;
	}

	public void setTwitterEmail(String pTwitterEmail) {
		this.twitterEmail = pTwitterEmail;
	}

	public String getFacebookEmail() {
		return facebookEmail;
	}

	public void setFacebookEmail(String pFacebookEmail) {
		this.facebookEmail = pFacebookEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pPassword) {
		this.password = pPassword;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String pImageUrl) {
		this.imageUrl = pImageUrl;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date pDateOfBirth) {
		this.dateOfBirth = pDateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String pPhone) {
		this.phone = pPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String pAddress) {
		this.address = pAddress;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int pSex) {
		this.sex = pSex;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String pQuote) {
		this.quote = pQuote;
	}

	public String getProfessionalDegree() {
		return professionalDegree;
	}

	public void setProfessionalDegree(String pProfessionalDegree) {
		this.professionalDegree = pProfessionalDegree;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String pCompany) {
		this.company = pCompany;
	}

	public String getWebPageUrl() {
		return webPageUrl;
	}

	public void setWebPageUrl(String pWebPageUrl) {
		this.webPageUrl = pWebPageUrl;
	}

	public String getInfluences() {
		return influences;
	}

	public void setInfluences(String pInfluences) {
		this.influences = pInfluences;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String pInterests) {
		this.interests = pInterests;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String pBiography) {
		this.biography =pBiography;
	}
	
}
