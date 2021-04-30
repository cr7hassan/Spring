package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustom(int theId);
}
