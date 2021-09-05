package com.xworkz.customer;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dao.CustomerDaoImpl;
import com.xworkz.customer.entity.Customer;

public class CustomerTester {

	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDaoImpl();

		List<Customer> list = new ArrayList<Customer>();
		for (int i = 0; i <= 30; i++) {

			Customer entity = new Customer("Mridul", "Shetty", "Murdeshwar", "mradulashetty01@gma.com", 581350);
			list.add(entity);

		}
		dao.saveList(list);
		dao.merge(1);
		System.out.println(list.size());

	}

}
