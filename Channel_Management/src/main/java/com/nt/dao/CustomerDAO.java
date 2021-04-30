package com.nt.dao;

import java.util.List;

import com.nt.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustom(int theId);
}	
