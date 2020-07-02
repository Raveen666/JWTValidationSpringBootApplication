package com.example.ProductCustomerValidationApplication.model;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Table2_Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerID; 
	private String customerName;
	private int policyNumber;
	private String insuredName;
	private Date dOB;
	private String emailAddress;
	private long mobileNumber;
	private String premiumMode;
	private String policyStatus;
	private long customerPANNO; 
	private Date policyIssuanceDate; 
	private long contactNumberLast_updated;
	private String emailAddressLast_updated;
	private long bankAccountNumber;
	private String whatsapp_opt_in_status;
	private String productName;
	private int productID;
	private boolean reinvestApplicable; 
	private String outstandingPayout;
	private String unclaimedAmount;
	private boolean nEFTRegistered;
	private boolean lastPremiumPaid;
	public Customer(long mobileNumber2, ArrayList arrayList) {
		// TODO Auto-generated constructor stub
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPremiumMode() {
		return premiumMode;
	}
	public void setPremiumMode(String premiumMode) {
		this.premiumMode = premiumMode;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public long getCustomerPANNO() {
		return customerPANNO;
	}
	public void setCustomerPANNO(long customerPANNO) {
		this.customerPANNO = customerPANNO;
	}
	public Date getPolicyIssuanceDate() {
		return policyIssuanceDate;
	}
	public void setPolicyIssuanceDate(Date policyIssuanceDate) {
		this.policyIssuanceDate = policyIssuanceDate;
	}
	public long getContactNumberLast_updated() {
		return contactNumberLast_updated;
	}
	public void setContactNumberLast_updated(long contactNumberLast_updated) {
		this.contactNumberLast_updated = contactNumberLast_updated;
	}
	public String getEmailAddressLast_updated() {
		return emailAddressLast_updated;
	}
	public void setEmailAddressLast_updated(String emailAddressLast_updated) {
		this.emailAddressLast_updated = emailAddressLast_updated;
	}
	public long getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getWhatsapp_opt_in_status() {
		return whatsapp_opt_in_status;
	}
	public void setWhatsapp_opt_in_status(String whatsapp_opt_in_status) {
		this.whatsapp_opt_in_status = whatsapp_opt_in_status;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public boolean isReinvestApplicable() {
		return reinvestApplicable;
	}
	public void setReinvestApplicable(boolean reinvestApplicable) {
		this.reinvestApplicable = reinvestApplicable;
	}
	public String getOutstandingPayout() {
		return outstandingPayout;
	}
	public void setOutstandingPayout(String outstandingPayout) {
		this.outstandingPayout = outstandingPayout;
	}
	public String getUnclaimedAmount() {
		return unclaimedAmount;
	}
	public void setUnclaimedAmount(String unclaimedAmount) {
		this.unclaimedAmount = unclaimedAmount;
	}
	public boolean isnEFTRegistered() {
		return nEFTRegistered;
	}
	public void setnEFTRegistered(boolean nEFTRegistered) {
		this.nEFTRegistered = nEFTRegistered;
	}
	public boolean isLastPremiumPaid() {
		return lastPremiumPaid;
	}
	public void setLastPremiumPaid(boolean lastPremiumPaid) {
		this.lastPremiumPaid = lastPremiumPaid;
	}
	
	
}
