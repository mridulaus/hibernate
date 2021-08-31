package com.xworkz.birds.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.birds.entity.BirdEntity;
import com.xworkz.birds.util.SFUtil;

public class BirdsDaoImpl implements BirdsDAO {

	@Override
	public int save(BirdEntity entity) {
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(BirdEntity.class);
		SessionFactory session = SFUtil.getFactory();
		Session ref = session.openSession();
		Transaction transact = ref.beginTransaction();
		int primarykey = (int) ref.save(entity);
		transact.commit();
		System.out.println(primarykey);
		ref.close();
		// session.close();

		return primarykey;
	}

	@Override
	public BirdEntity readById(int id) {
		// Configuration config = new
		// Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory session = SFUtil.getFactory();
		Session ref = session.openSession();
		BirdEntity entity = ref.get(BirdEntity.class, id);
		System.out.println(entity);
		return entity;
	}

	@Override
	public void updateNameById(int id, String name) {
		SessionFactory session = SFUtil.getFactory();
		Session ref = session.openSession();
		Transaction transact = ref.beginTransaction();
		BirdEntity entity = ref.get(BirdEntity.class, id);
		entity.setName(name);
		ref.update(entity);
		ref.getTransaction().commit();
		System.out.println("bird name is updated   " + entity);
		ref.close(); // session closed

	}

	@Override
	public void deleteById(int id) {
		SessionFactory session = SFUtil.getFactory();
		Session ref = session.openSession();
		Transaction transact = ref.beginTransaction();
		// BirdEntity dto = new BirdEntity();
		BirdEntity entity = ref.get(BirdEntity.class, id); // upcasting
		ref.delete(entity);
		ref.getTransaction();
		System.out.println("deleted :" + id);
		session.close();

	}

}
