package com.nt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.CustomerDAO;
import com.nt.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//need to inject dao
	@Autowired
	private CustomerDAO customerDao;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		return customerDao.getCustomer();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		customerDao.saveCustomer(theCustomer);		
	}


	@Override
	@Transactional
	public Customer getCustom(int theId) {
		
		return customerDao.getCustom(theId);
	}

}
