package com.nt.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	private static final String CREATE_QUERY="from Customer";
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public List<Customer> getCustomer() {
		
		//create and get the hibernate session
		Session ses=session.getCurrentSession();
		
		//create a query
		Query<Customer> query=ses.createQuery(CREATE_QUERY, Customer.class);
		
		//execute query and get result list
		List<Customer> customer=query.getResultList();
	
		return customer;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		//create and get the hibernate session
		Session ses=session.getCurrentSession();
				
		//create a query
		ses.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustom(int theId) {
		//create and get the hibernate session
		Session ses=session.getCurrentSession();
		
		//retreive and read from database using primarykey
		Customer theCustomer=ses.get(Customer.class,theId);
		return theCustomer;
	}

}
