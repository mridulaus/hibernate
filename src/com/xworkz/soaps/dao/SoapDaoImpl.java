package com.xworkz.soaps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.soaps.dto.*;
import com.xworkz.soaps.dto.SoapDTO;

public class SoapDaoImpl implements SoapDAO {

	@Override
	public int save(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
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
