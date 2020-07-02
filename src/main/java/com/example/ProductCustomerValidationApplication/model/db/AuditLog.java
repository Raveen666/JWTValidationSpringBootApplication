package com.example.ProductCustomerValidationApplication.model.db;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="Table5_audit_logs")
public class AuditLog implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String logId;

	// it will contain log in JSON format
	private String log;

	private Date createdDate;

	public AuditLog() {

	}

	public AuditLog(String log) {
		super();
		this.log = log;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
