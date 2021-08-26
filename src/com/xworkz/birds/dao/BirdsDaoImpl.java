package com.xworkz.birds.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.birds.entity.BirdEntity;


public class BirdsDaoImpl implements BirdsDAO {

	@Override
	public int save(BirdEntity entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BirdEntity.class);
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
	public BirdEntity readById(int id) {
		Configuration config = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory session = config.buildSessionFactory();
		Session ref = session.openSession();
		BirdEntity entity = ref.get(BirdEntity.class, id);
		System.out.println(entity);
		return entity;
	}

}
