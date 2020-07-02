package com.example.ProductCustomerValidationApplication.response;

public class DefaultResponse {

	
	private Integer status;
	private String data;
	private String message;

	public DefaultResponse() {
	}

	
	public DefaultResponse(Integer status,String message) {
		super();
		this.message = message;
		this.status = status;
	}

	public DefaultResponse(Integer status, String data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}

	

	

	

}
