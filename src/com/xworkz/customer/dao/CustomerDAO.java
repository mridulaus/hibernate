package com.xworkz.customer.dao;

import java.util.List;


import com.xworkz.customer.entity.Customer;

public interface CustomerDAO {
	
	void saveList(List<Customer> entity);
	void merge( int id);
}
