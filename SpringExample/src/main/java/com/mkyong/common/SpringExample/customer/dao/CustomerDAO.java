package com.mkyong.common.SpringExample.customer.dao;

import com.mkyong.common.SpringExample.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
