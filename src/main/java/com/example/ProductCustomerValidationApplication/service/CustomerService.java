package com.example.ProductCustomerValidationApplication.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.ProductCustomerValidationApplication.model.Customer;
import com.example.ProductCustomerValidationApplication.model.MobileDetails;
import com.example.ProductCustomerValidationApplication.repository.CustomerRepository;
import com.example.ProductCustomerValidationApplication.repository.MobileDetailsRepository;
import com.example.ProductCustomerValidationApplication.response.CustomerResponse;
import com.example.ProductCustomerValidationApplication.response.DefaultResponse;
import com.harrier.goveva.core.model.db.MomTask;

@Service
@Transactional
public class CustomerService {

	private final CustomerRepository customerRepository;
	private final MobileDetailsRepository mobileDetailsRepository;
	
	public CustomerService(CustomerRepository customerRepository, MobileDetailsRepository mobileDetailsRepository) {
		super();
		this.customerRepository = customerRepository;
		this.mobileDetailsRepository = mobileDetailsRepository;
	}


	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}


	public Customer getCustomerByMobileNumberAndSavedInAnotherTable(long mobileNumber, String otp) {
		Customer customer=customerRepository.findByMobileNumber(mobileNumber);
		
		if(customer!=null) {
			MobileDetails mobileDetails=new MobileDetails();
			mobileDetails.setMobileNumber(mobileNumber);
			mobileDetails.setoTP(otp);
			mobileDetailsRepository.save(mobileDetails);
		}
		return null;
}


	public DefaultResponse getCustomerPolicyInfo(String authenticationToken, String policyNumber) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findByPolicyNumber(policyNumber)
				.orElseThrow(() -> new NotFoundException("Customer not found."));
		
		return new DefaultResponse(1006,"Customer Policy Info");
	}


	public DefaultResponse emailValidation(String authenticationToken, String emailID, String dOB) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findByEmailIDDOB(emailID,dOB)
				.orElseThrow(() -> new NotFoundException("Customer not found."));
		
		return new DefaultResponse(1005,"info@xangars.com");
	}
}
