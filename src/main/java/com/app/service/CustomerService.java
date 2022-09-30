package com.app.service;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.app.exceptions.CustomerException;
import com.app.model.Customer;


public interface CustomerService {

public Customer addCustomer(Customer cust) throws CustomerException ;
	
	public Customer updateCustomer(Customer cust, String key) throws CustomerException , LoginException ;
	
	public Customer removeCustomer(Customer cust, String key) throws CustomerException ;
	
	public Customer viewCustomer(Customer cust)  throws CustomerException;
	
	public List<Customer> viewAllCustomer(String location) throws CustomerException ;
	
}
