package com.example.ProductCustomerValidationApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ProductCustomerValidationApplication.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	public Customer findByMobileNumber(long mobileNumber);

	public Customer findByPolicyNumber(String policyNumber);

	public Object findByEmailIDDOB(String emailID, String dOB);
}
