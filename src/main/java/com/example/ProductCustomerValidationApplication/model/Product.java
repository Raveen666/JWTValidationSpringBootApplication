package com.example.ProductCustomerValidationApplication.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Table1_Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productID;
	private String productName;
	private String productDetails;
	private Date productLaunchDate;
	private Date productEndDate;

}
