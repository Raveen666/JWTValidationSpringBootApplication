package com.example.ProductCustomerValidationApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductCustomerValidationApplication.model.Customer;
import com.example.ProductCustomerValidationApplication.response.CustomerResponse;
import com.example.ProductCustomerValidationApplication.response.DefaultResponse;
import com.example.ProductCustomerValidationApplication.service.CustomerService;

@RestController
public class CustmerController {

	@Autowired
	private CustomerService customerService;

	// save customers
	@PostMapping(value = "/saveconstomer")
	public String registerStudentRest(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return "Customer Successfully";
	}

	// Security JWT Token
	// Check Mobile Number in Table 2 and Create Entry in Table 4
	// get customer by mobile number
	@RequestMapping(value = "customer/mobileNumbers/{mobileNumber}/otp/{otp}", method = RequestMethod.PUT)
	public CustomerResponse getCustomerByMobileNumberAndSavedInAnotherTable(
			@PathVariable("mobileNumber") long mobileNumber, @PathVariable("otp") String otp) {

		customerService.getCustomerByMobileNumberAndSavedInAnotherTable(mobileNumber, otp);
		return null;

	}

	// Customer Policy Info
	@GetMapping(path = "customer/policyNumber/{policyNumber}")
	public DefaultResponse getCustomerPolicyInfo(@RequestHeader("authentication-token") String authenticationToken,@PathVariable("policyNumber") String policyNumber) {
		return customerService.getCustomerPolicyInfo(authenticationToken,policyNumber);
	}
	
	//Email Validation
		@GetMapping(path = "customer/emailID/{emailID}/DOB/{DOB}")
		public DefaultResponse emailValidation(@RequestHeader("authentication-token") String authenticationToken,@PathVariable("emailID") String emailID,@PathVariable("DOB") String DOB) {
			return customerService.emailValidation(authenticationToken,emailID,DOB);
		}
}
