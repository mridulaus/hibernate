package com.xworkz.customer.dao;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.customer.entity.Customer;
import com.xworkz.customer.util.SFUtil;

public class CustomerDaoImpl implements CustomerDAO {
	private SessionFactory fact = SFUtil.getFactory();

	
		

	@Override
	public void merge(int id) {
		try (Session ref = fact.openSession()) {
			Transaction transact = ref.beginTransaction();
			Customer entity = ref.get(Customer.class, id);
			entity.setCity("Karwar");
			ref.update(entity);
			ref.getTransaction().commit();
			System.out.println("data is updated   " + entity);
		}
		
	}




	@Override
	public void saveList(List<Customer> entity) {
		try (Session ref = fact.openSession()) {
			Transaction transact = ref.beginTransaction();
			AtomicInteger atomic = new AtomicInteger(0);
			entity.forEach(cust -> {

				Customer customer = ref.load(Customer.class, cust.getId());
				if (customer != null) {
					ref.save(cust);
					System.out.println(cust);
				}
				if (atomic.incrementAndGet() % 10 == 0) {
				
					ref.flush();
					//ref.clear();
					
				}

			});

			transact.commit();
		}

	}
	}


