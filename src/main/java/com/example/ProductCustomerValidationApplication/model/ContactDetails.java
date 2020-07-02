package com.example.ProductCustomerValidationApplication.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Table3_ContactDetails")
public class ContactDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int optinID;
	private long mobileNumber;
	private long policyNumber; //(Unique Field)
	private Date optinDate;
}
