package com.xworkz.dryfruits.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dryfruits.dto.DryFruitsDTO;

public class DryFruitsDaoImpl implements  DryFruitsDAO{

	@Override
	public int save(DryFruitsDTO entity) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitsDTO.class);
		SessionFactory session = config.buildSessionFactory();
		Session ref = session.openSession();
		Transaction transact = ref.beginTransaction();
		int primarykey = (int)ref.save(entity);
		transact.commit();
		System.out.println(primarykey);
		ref.close();
		session.close();
	
		return primarykey;
	}

	@Override
	public int read(DryFruitsDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitsDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session ref = factory.openSession();
		Transaction transact = ref.beginTransaction();
		DryFruitsDTO dt = (DryFruitsDTO) ref.get(DryFruitsDTO.class, 1);
		
		transact.commit();
		System.out.println(dt);
		ref.close();
		factory.close();

		return 1;
	}

	@Override
	public int update(DryFruitsDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitsDTO.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transact = session.beginTransaction();
		DryFruitsDTO dt = (DryFruitsDTO) session.get(DryFruitsDTO.class, 2); // update operation
		dt.setName("raisins");
		session.update(dt);
		session.getTransaction().commit();
		System.out.println("updated dryfruit : " + dt);
		session.close();
		return 1;
	}

	@Override
	public int delete(DryFruitsDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryFruitsDTO.class);
		SessionFactory session = config.buildSessionFactory();
		Session ref = session.openSession();
		Object obj = ref.load(DryFruitsDTO.class, new Integer(1));
		DryFruitsDTO dt = (DryFruitsDTO) obj;
		Transaction transact = ref.beginTransaction();
		ref.delete(dt);
		System.out.println("the row has been deleted");
		transact.commit();
		session.close();
		session.close();
		return 1;
	}

}
