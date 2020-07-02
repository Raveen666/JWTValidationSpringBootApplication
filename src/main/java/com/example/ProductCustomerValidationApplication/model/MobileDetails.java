package com.example.ProductCustomerValidationApplication.model;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Table4_MobileDetails")
public class MobileDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private long mobileNumber;
	private String oTP; 
	private Time expireTime;
	private Time createdTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getoTP() {
		return oTP;
	}
	public void setoTP(String oTP) {
		this.oTP = oTP;
	}
	public Time getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Time expireTime) {
		this.expireTime = expireTime;
	}
	public Time getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Time createdTime) {
		this.createdTime = createdTime;
	}
	
	
}
