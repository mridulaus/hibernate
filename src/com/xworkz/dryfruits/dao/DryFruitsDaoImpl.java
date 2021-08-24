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

}
