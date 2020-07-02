package com.example.ProductCustomerValidationApplication.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * this class is extended by those classes who want to maintain the audit trial
 * or the classes where created date and modified date is required Almost all
 * classes will implement this base entity, you can also add id property here
 * as, all the entities will have id of their own
 */

public abstract class Auditable<U> {

	@CreatedBy
	@JsonIgnore
	protected U createdBy;

	@CreatedDate
	@JsonIgnore
	protected Date createdDate;

	@LastModifiedBy
	@JsonIgnore
	protected U lastModifiedBy;

	@LastModifiedDate
	@JsonIgnore
	protected Date lastModifiedDate;

	public U getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(U createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public U getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(U lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}